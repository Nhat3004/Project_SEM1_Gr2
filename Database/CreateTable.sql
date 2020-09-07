use Prj1;
-- select * from Staff;
-- -- where account ='df7ac565f8308523e45b3b528513d8bd' and password='80be2a761fe62ab3f023e3f77dc9b8dd';
-- -- Nhatnl3004/Nhatnl19024 03144764401
-- select * from Shop where shop_id=1;
select * from Drink order by sold DESC;
select * from Invoice;
select * from Invoice
where invoice_id=1;
select concat(d.drink_code,'-',d.drink_name) as drink_name, d.drink_unit_price, od.quantity from InvoiceDetails od inner join Drink d where invoice_id=1 and od.drink_code=d.drink_code;
-- call sp_updateInvoiceDetails(1,'HD02', 100);
-- select concat(d.drink_code,'-',d.drink_name) as drink_name, d.drink_unit_price, od.quantity from InvoiceDetails od inner join Drink d where invoice_id=1 and od.drink_code=d.drink_code;