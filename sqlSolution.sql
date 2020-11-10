CREATE DATABASE education;
USE education;

CREATE TABLE institution(
institutionid int (11),
name varchar (250),
PRIMARY KEY (institutionid)
);

CREATE TABLE course(
courseid int (11),
name varchar (250),
institution int (11)
PRIMARY KEY (courseid),
FOREIGN KEY (institution) REFERENCES institution(institutionid)
);


CREATE TABLE student(
studentid int (11),
name varchar (250),
coures int (11),
PRIMARY KEY (studentid)
FOREIGN KEY (coures) REFERENCES course(coures)
);

select i.name Institution_name,c.name Course_Name,
 count(s.studentid) Number_Of_Students from student s
 inner join course c on s.coures=c.courseid
 inner join institution i on c.institution = i.institutionid;