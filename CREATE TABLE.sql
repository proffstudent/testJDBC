DROP TABLE main.Students;
DROP TABLE main.GroupS;
DROP TABLE main.Lectures;
DROP TABLE main.Journal;

CREATE TABLE main.Student(
     ID SERIAL NOT NULL,
     NAME character varying(50) NOT NULL,
	 AGE bigint,
	 PRIMARY KEY (id)
);
CREATE TABLE main.GroupS(
     ID SERIAL NOT NULL,
     NAME character varying(50) NOT NULL,
	 PRIMARY KEY (id)
);
CREATE TABLE main.Lectures(
     ID SERIAL NOT NULL,
     NAME character varying(50) NOT NULL,
	 PRIMARY KEY (id)
);
CREATE TABLE main.Journal(
     ID SERIAL NOT NULL,
     ID_student bigint NOT NULL,
	 ID_lectures bigint NOT NULL,
	 ID_group bigint NOT NULL,
	 data_lect date,
	 PRIMARY KEY (id)	 
);