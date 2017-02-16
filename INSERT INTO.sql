INSERT INTO main.Student(ID,NAME,AGE)
    VALUES (1, 'admin', 18);
INSERT INTO main.Student(ID,NAME,AGE)
    VALUES (2, 'proff', 20);
INSERT INTO main.Student(ID,NAME,AGE)
    VALUES (3, 'stud', 21);
INSERT INTO main.Student(ID,NAME,AGE)
    VALUES (4, 'bulichev', 22);
INSERT INTO main.Student(ID,NAME,AGE)
    VALUES (5, 'medve', 20);
	
INSERT INTO main.GroupS(ID,NAME)
    VALUES (1, 'STC-01');
INSERT INTO main.GroupS(ID,NAME)
    VALUES (2, 'STC-02');
INSERT INTO main.GroupS(ID,NAME)
    VALUES (3, 'STC-03');
INSERT INTO main.GroupS(ID,NAME)
    VALUES (4, 'STC-04');
	
INSERT INTO main.Lectures(ID,NAME)
    VALUES (1, 'Collections');
INSERT INTO main.Lectures(ID,NAME)
    VALUES (2, 'Threads');
INSERT INTO main.Lectures(ID,NAME)
    VALUES (3, 'Cuncurrent');
	
INSERT INTO main.Journal(ID,ID_student,ID_lectures,ID_group,data_lect)
    VALUES (1, 1, 1, 1, '05 Dec 2016');
INSERT INTO main.Journal(ID,ID_student,ID_lectures,ID_group,data_lect)
    VALUES (2, 1, 2, 1, '06 Dec 2016');
INSERT INTO main.Journal(ID,ID_student,ID_lectures,ID_group,data_lect)
    VALUES (3, 2, 3, 2, '07 Dec 2016');
INSERT INTO main.Journal(ID,ID_student,ID_lectures,ID_group,data_lect)
    VALUES (4, 3, 3, 2, '07 Dec 2016');
INSERT INTO main.Journal(ID,ID_student,ID_lectures,ID_group,data_lect)
    VALUES (5, 4, 3, 3, '07 Dec 2016');
INSERT INTO main.Journal(ID,ID_student,ID_lectures,ID_group,data_lect)
    VALUES (6, 5, 3, 4, '07 Dec 2016');	
	