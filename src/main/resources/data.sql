INSERT INTO Address (street, postal_code, city)
values ('Gåsvägen 13', 66194, 'Ankeborg'),          --kalle och knattarna tidigare
       ('Paradisäppelvägen 111', 66194, 'Ankeborg'),-- kalles nya
       ('Persikogatan 101', 66194, 'Ankeborg'),--kajsa
       ('Tomtebacken', 66194, 'Ankeborg'),-- joakim
       ('Stenvägen 10', 66194, 'Ankeborg'); --musse pigg


INSERT INTO Member(first_name, last_name, email, phone, date_of_birth, address_id)
VALUES ('Kalle', 'Anka', 'kalle_anka@gmail.com', 0701313113, 19200609, 2),
       ('Kajsa', 'Anka', 'kajsa.anka@gmail.com', 0701937101, 19201202, 3),
       ('Fnatte', 'Anka', 'knattarna_2@gmail.com',0, 19401017, 2),
       ('Joakim', 'Von Anka', 'theVonAnka@gmail.com', 0709999999, 18671224, 4),
       ('Musse', 'Pigg', 'musse-pigg28@gmail.com', 0703192859, 19201018, 5);
