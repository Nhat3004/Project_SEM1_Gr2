drop database if exists Prj1;
create database Prj1;
use Prj1;
CREATE USER 'nhat.h'@'localhost' IDENTIFIED BY '88888888';
create table Drink(
	drink_id 		int 			auto_increment	primary key,
    drink_code		varchar(10)		not null 		unique,
    drink_name 		varchar(60) 	not null,
    drink_category	varchar(60)		not null,
    drink_unit_price decimal(20,2)  default 0
);

create table Shop(
	shop_id 		int  			auto_increment 	primary key,
    shop_name 		varchar(50) 	not null,
    shop_tel 		varchar(10) 	not null 		unique,
    shop_address 	varchar(100) 	not null
);
create table Invoice(
	invoice_id		int			auto_increment	primary key,
    shop_id			int 		not null,
    staff_id		int 		not null,
    invoice_date	datetime 	default now()
);
create table InvoiceDetails(
	order_id int 	not null,
	drink_id int 	not null,
    quantity int 	not null
);

create table Staff(
	staff_id 		int  			auto_increment 	primary key,
    staff_name 		varchar(50) 	not null,
    staff_tel 		varchar(10) 	not null 		unique,
    staff_address 	varchar(100) 	not null,
    staff_email 	varchar(100) 	not null 		unique,
    staff_id_card 	varchar(12) 	not null 		unique,
    account 		varchar(20) 	not null 		unique,
    password 		varchar(45) 	not null,
    position 		varchar(30) 	not null
);