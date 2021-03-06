/*7.     გვაქვს Teacher ცხრილი, რომელსაც აქვს შემდეგი მახასიათებლები: 
		სახელი, გვარი, სქესი, საგანი. გვაქვს Pupil ცხრილი, რომელსაც აქვს 
		შემდეგი მახასიათებლები: სახელი, გვარი, სქესი, კლასი. ააგეთ ნებისმიერ 
		რელაციურ ბაზაში ისეთი დამოკიდებულება, რომელიც საშუალებას მოგვცემს,
		რომ მასწავლებელმა ასწავლოს რამოდენიმე მოსწავლეს და ამავდროულად მოსწავლეს
		ჰყავდეს რამდენიმე მასწავლებელი (როგორც რეალურ ცხოვრებაში).*/


CREATE DATABASE TestDB;
go
use TestDB
/*1. დაწერეთ sql რომელიც ააგებს შესაბამის table-ებს.*/
CREATE TABLE Teacher(
id int IDENTITY Primary key ,
firstName varchar(20),
lastName varchar(20),
gender int check(gender = 1 or gender=2),
courseName varchar(20)
);

CREATE TABLE Pupil(
id int IDENTITY Primary key ,
firstName varchar(20),
lastName varchar(20),
gender int check(gender = 1 or gender=2),
class int check(class>0 and class<13)
);
go

CREATE TABLE TeacherPupil(
teacherId int Foreign Key references Teacher(id),
pupilId int Foreign Key references Pupil(id)
);
go

/*2. დაწერეთ sql რომელიც დააბრუნებს ყველა მასწავლებელს, რომელიც 
	 ასწავლის მოსწავლეს, რომელის სახელია: „გიორგი“ */

SELECT Teacher.id,Teacher.firstName,Teacher.lastName,Teacher.gender,Teacher.courseName 
from Teacher join TeacherPupil On Teacher.id=TeacherPupil.teacherId 
join Pupil on TeacherPupil.pupilId=Pupil.id WHERE Pupil.firstName='giorgi';