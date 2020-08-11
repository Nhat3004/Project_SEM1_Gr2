use prj1;

insert into Staff(staff_name, staff_tel, staff_address, staff_email, staff_id_card, account, password, position)
	values('Nguyễn Long Nhật', '0966452513', 'Vĩnh Phúc', 'nhatnl.19024@vtc.edu.vn', '026200004041', 'nhatnl_3004', 'Nhatnl.19024', 'Staff'),
		('Lê Thị Thanh Huyền', '0355990731', 'Vĩnh Phúc', 'huyenlt.1804@gmail.com', '026230003214', 'huyenlt_1804', 'Huyen.1804', 'Manager');
insert into Shop(shop_name, shop_tel, shop_address) 
	value('VTCA Milk Tea Shop', '0981114757', 'Tầng 4, 18 Đường Tam Trinh, Mai Động, Hai Bà Trưng, Hà Nội');
select * from Staff;
select * from Shop;