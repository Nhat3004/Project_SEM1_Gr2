drop database if exists Prj1;
create database Prj1;
use Prj1;
-- CREATE USER 'shop'@'localhost' IDENTIFIED BY '88888888';
GRANT ALL PRIVILEGES ON * . * TO 'shop'@'localhost';
create table Shop(
	shop_id 		int  			auto_increment 	primary key,
    shop_name 		varchar(50) 	not null,
    shop_tel 		varchar(10) 	not null 		unique,
    shop_address 	varchar(100) 	not null
);

create table Staff(
	staff_id 		int  			auto_increment 	primary key,
    staff_name 		varchar(50) 	not null,
    staff_tel 		varchar(10) 	not null 		unique,
    staff_address 	varchar(100) 	not null,
    staff_email 	varchar(100) 	not null 		unique,
    staff_id_card 	varchar(12) 	not null 		unique,
    account 		varchar(32) 	not null 		unique,
    password 		varchar(32) 	not null,
    position 		varchar(30) 	not null
);

create table Drink(
	drink_id 		int 			auto_increment primary key,
    drink_code		varchar(10)		not null unique,
    drink_name 		varchar(60) 	not null,
    drink_unit_price decimal(20,2)  default 0,
    sold		int 			default 0
);
create table Invoice(
	invoice_id		int			auto_increment	primary key,
    shop_id			int 		not null,
    staff_id		int 		not null,
    invoice_date	datetime 	default now(),
    constraint fk_Invoice_Shop foreign key(shop_id) references Shop(shop_id),
    constraint fk_Invoice_Staff foreign key(staff_id) references Staff(staff_id)
);

create table InvoiceDetails(
	invoice_id int 	not null,
	drink_code varchar(10) 	not null,
    quantity int 	not null,
    ice int not null,
    sugar int not null,
    constraint pk_InvoiceDetails primary key (invoice_id, drink_code, ice, sugar),
    constraint fk_InvoiceDetails_Invoice foreign key(invoice_id) references Invoice(invoice_id),
    constraint fk_InvoiceDetails_Drink foreign key(drink_code) references Drink(drink_code)
);
delimiter $$
create procedure sp_insertInvoice(IN shopID int , IN staffID int)
begin
	insert into Invoice(shop_id, staff_id) 
			value(shopID, staffID);
end $$
delimiter ;
delimiter $$
create procedure sp_insertInvoiceDetails(IN invoiceID int , IN drinkCode varchar(10), IN quantity int, IN ice int, IN sugar int)
begin
	call sp_updateDrinkSold(drinkCode, quantity);
	insert into InvoiceDetails(invoice_id, drink_code, quantity, ice, sugar) 
			value(invoiceID, drinkCode, quantity, ice, sugar);
end $$
delimiter ;

delimiter $$
create procedure sp_insertDrink(IN code varchar(10), IN name varchar(60), IN unitPrice decimal(20,2), OUT drinkId int)
begin
 insert into Drink(drink_code, drink_name, drink_unit_price) value
						(code, name, unitPrice);
    select max(drink_id) into drinkId from Drink;
end $$
delimiter ;
delimiter $$
create procedure sp_updateDrink(IN code varchar(10),IN name varchar(60), IN unitPrice decimal(20,2), OUT isTrue int)
begin
 update Drink
 set drink_unit_price = unitPrice, drink_name = name
 where drink_code = code ;
	select 1 into isTrue;
end $$
delimiter ;
delimiter $$
create procedure sp_updateDrinkSold(IN code varchar(10), IN quantity int)
begin 
	update Drink
    set sold = sold + quantity
    where drink_code = code;
end $$
delimiter ;
delimiter $$
create procedure sp_updateInvoiceDetails(IN invoiceID int , IN drinkCode varchar(10), IN quantityNew int, IN changes int, IN iceNew int, IN sugarNew int)
begin
	call sp_updateDrinkSold(drinkCode, changes);
    update InvoiceDetails
    set quantity = quantityNew, ice = iceNew, sugar=sugarNew
    where invoice_id = invoiceID AND drink_code = drinkCode;
end $$
delimiter ;
