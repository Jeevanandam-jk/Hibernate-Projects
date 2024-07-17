create database Mapping;

select * from Laptop;
desc Laptop;

select * from Laptop_Desc;
desc Laptop_Desc;

create table Laptop (Lap_Id int not null primary key , Lap_Name varchar(20), Lap_Owner varchar(20));
insert into Laptop values(1,"HP","Taylor");
insert into Laptop values(2,"Acer","Bunny");
insert into Laptop values (3,"Apple","Steve");
insert into Laptop values (4,"Asus","Justin");

drop table Laptop_desc;

create table Laptop_Desc (LapModel_Id int primary key,Lap_Id int,Lap_Name varchar(20), Lap_Model varchar (20), Lap_Price int,foreign key(Lap_Id) references Laptop(Lap_Id));
insert into Laptop_Desc values(1,1,"HP","Pavillion",45000);
insert into Laptop_Desc values(2,1,"HP","Envy",50000);
insert into Laptop_Desc values(3,1,"HP","EliteBook",60000);
insert into Laptop_desc values (4,2,"Acer","Aspire",45000);
insert into Laptop_desc values (5,2,"Acer","SwiftGo",48000);
insert into Laptop_desc values (6,2,"Acer","Nitro",50000);
insert into Laptop_Desc values (7,3,"Apple","Macbook Mini",80000);
insert into Laptop_Desc values (8,3,"Apple","Macbook Air 15",85000);
insert into Laptop_Desc values (9,3,"Apple","Macbook Pro 16",90000);
insert into Laptop_Desc values(10,4,"Asus","ZenBook",55000);
insert into Laptop_Desc values(11,4,"Asus","VivoBook",57000);
insert into Laptop_Desc values(12,4,"Asus","Tuff Gaming",60000);

