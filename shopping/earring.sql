select * from product

create table product_Ear (
pid INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
name varchar(50) not null,
code varchar(50) not null,
category varchar(50) not null,
type varchar(50) not null,
price int not null,
contents text not null,
regist_date date
);

INSERT INTO `shopping`.`product_Ear`
		(`name`
		,`code`
		,`catagory`
		,`type`
		,`price`
		,`contents`
		,`resist_data`)
	VALUES
		('jj'
		,'test11'
		,'test12'
		,'test13'
		,20000
		,'test15'
		,now());
