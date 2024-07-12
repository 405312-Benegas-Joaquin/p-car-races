
INSERT INTO track_races (track_name, track_length, track_difficulty)
VALUES ('Monaco', 3.5, 5);
INSERT INTO track_races (track_name, track_length, track_difficulty)
VALUES ('Silverstone', 4.2, 7);
INSERT INTO track_races (track_name, track_length, track_difficulty)
VALUES ('Monza', 2.8, 4);
INSERT INTO track_races (track_name, track_length, track_difficulty)
VALUES ('Spa-Francorchamps', 5.0, 8);
INSERT INTO track_races (track_name, track_length, track_difficulty)
VALUES ('Suzuka', 3.0, 6);

INSERT INTO drivers (name, age, experience)
VALUES ('John Doe', 30, 10);
INSERT INTO drivers (name, age, experience)
VALUES ('Jane Smith', 25, 5);
INSERT INTO drivers (name, age, experience)
VALUES ('Alice Brown', 35, 12);
INSERT INTO drivers (name, age, experience)
VALUES ('Bob Johnson', 28, 8);
INSERT INTO drivers (name, age, experience)
VALUES ('Charlie Davis', 40, 15);

INSERT INTO drivers (name, age, experience)
VALUES ('Lewis Hamilton', 30, 14),
       ('Sebastian Vettel', 30, 15),
       ('Max Verstappen', 30, 6),
       ('Charles Leclerc', 30, 4),
       ('Daniel Ricciardo', 30, 10),
       ('Fernando Alonso', 30, 20);

INSERT INTO cars (car_brand, car_model, car_year, max_speed, car_driver_id)
VALUES ('Toyota', 'Corolla', 2010, 180, 1);
INSERT INTO cars (car_brand, car_model, car_year, max_speed, car_driver_id)
VALUES ('Honda', 'Civic', 2012, 190, 2);
INSERT INTO cars (car_brand, car_model, car_year, max_speed, car_driver_id)
VALUES ('Ford', 'Focus', 2015, 200, 3);
INSERT INTO cars (car_brand, car_model, car_year, max_speed, car_driver_id)
VALUES ('Chevrolet', 'Malibu', 2018, 210, 4);
INSERT INTO cars (car_brand, car_model, car_year, max_speed, car_driver_id)
VALUES ('BMW', '3 Series', 2020, 220, 5);

INSERT INTO races (car_name, track_id, car_status)
VALUES ('Race 1', 1, 'SCHEDULED');
INSERT INTO races (car_name, track_id, car_status)
VALUES ('Race 2', 2, 'FINISHED');
INSERT INTO races (car_name, track_id, car_status)
VALUES ('Race 3', 3, 'SUSPENDED');
INSERT INTO races (car_name, track_id, car_status)
VALUES ('Race 4', 4, 'CANCELLED');
INSERT INTO races (car_name, track_id, car_status)
VALUES ('Race 5', 5, 'SCHEDULED');
INSERT INTO races (car_name, track_id, car_status)
VALUES ('Race 6', 3, 'FINISHED');

INSERT INTO race_details (race_id, car_id, time)
VALUES (2, 2, 125.0);
INSERT INTO race_details (race_id, car_id, time)
VALUES (2, 1, 120.5);
INSERT INTO race_details (race_id, car_id, time)
VALUES (2, 3, 118.7);
INSERT INTO race_details (race_id, car_id, time)
VALUES (2, 4, 122.3);
INSERT INTO race_details (race_id, car_id, time)
VALUES (2, 5, 119.9);

INSERT INTO race_details (race_id, car_id, time)
VALUES (6, 4, 125.0);
INSERT INTO race_details (race_id, car_id, time)
VALUES (6, 5, 120.5);
INSERT INTO race_details (race_id, car_id, time)
VALUES (6, 3, 118.7);
INSERT INTO race_details (race_id, car_id, time)
VALUES (6, 2, 122.3);
INSERT INTO race_details (race_id, car_id, time)
VALUES (6, 1, 119.9);

INSERT INTO race_participants (race_id, car_id)
VALUES (1, 1);
INSERT INTO race_participants (race_id, car_id)
VALUES (1, 2);
INSERT INTO race_participants (race_id, car_id)
VALUES (1, 3);

INSERT INTO race_participants (race_id, car_id)
VALUES (2, 1);
INSERT INTO race_participants (race_id, car_id)
VALUES (2, 2);
INSERT INTO race_participants (race_id, car_id)
VALUES (2, 3);
INSERT INTO race_participants (race_id, car_id)
VALUES (2, 4);
INSERT INTO race_participants (race_id, car_id)
VALUES (2, 5);

INSERT INTO race_participants (race_id, car_id)
VALUES (6, 1);
INSERT INTO race_participants (race_id, car_id)
VALUES (6, 2);
INSERT INTO race_participants (race_id, car_id)
VALUES (6, 3);
INSERT INTO race_participants (race_id, car_id)
VALUES (6, 4);
INSERT INTO race_participants (race_id, car_id)
VALUES (6, 5);

