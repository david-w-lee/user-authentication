create table user(
	user_id int auto_increment,
	first_name nvarchar(200),
	last_name nvarchar(200),
	email nvarchar(100),
	phone_number nvarchar(20),
	create_time timestamp
);