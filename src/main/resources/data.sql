INSERT INTO roles(description,is_deleted) VALUES('Admin','FALSE')
INSERT INTO roles(description,is_deleted) VALUES('Teacher','FALSE')
INSERT INTO roles(description,is_deleted) VALUES('Mentor','FALSE')
INSERT INTO roles(description,is_deleted) VALUES('beDev','FALSE')

INSERT INTO users (enabled,first_name,gender,last_name,pass_word,user_name,phone,role_id,is_deleted) VALUES ('TRUE','Mehmet','MALE','Kal','initial','mehmetkal','11115180','1','FALSE')
INSERT INTO users (enabled,first_name,gender,last_name,pass_word,user_name,phone,role_id,is_deleted) VALUES ('TRUE','Ozzy','MALE','al','initial','ozzyall@cydeo.com','11115180','2','FALSE')
INSERT INTO users (enabled,first_name,gender,last_name,pass_word,user_name,phone,role_id,is_deleted) VALUES ('TRUE','FATMA','FEMALE','Merime','initial','fatma@cydeo.com','11115180','2','FALSE')
INSERT INTO users (enabled,first_name,gender,last_name,pass_word,user_name,phone,role_id,is_deleted) VALUES ('TRUE','Cundullah','MALE','Tal','initial','cundullah@cydeo.com','11115180','3','FALSE')
INSERT INTO users (enabled,first_name,gender,last_name,pass_word,user_name,phone,role_id,is_deleted) VALUES ('TRUE','Mehmet','MALE','Kal','initial','mehmetkaldev','11115180','4','FALSE')



INSERT INTO lectures (is_deleted,completed_duration,count_of_topics,created_date, expected_duration,lecture_name,lecture_level) VALUES ('FALSE', 0, 0,'05-05-2022',6000,'JAVA CORE','BEGINNER')
INSERT INTO lectures (is_deleted,completed_duration,count_of_topics,created_date, expected_duration,lecture_name,lecture_level) VALUES ('FALSE', 0, 0,'05-05-2022',6000,'JAVA SPRING','BEGINNER')
INSERT INTO lectures (is_deleted,completed_duration,count_of_topics,created_date, expected_duration,lecture_name,lecture_level) VALUES ('FALSE', 0, 0,'05-05-2022',6000,'JAVA DS ','BEGINNER')

INSERT INTO topics (is_deleted,completed_duration,count_of_annotations, count_of_definitions, count_of_reviews, count_of_stories,create_date, status,topic_intro,topic_name,total_duration,lecture_id) VALUES ('FALSE', 300,0,0,0,0,'06-05-2022','OPEN', 'For,While and Iteration','Loops',300,1)
INSERT INTO topics (is_deleted,completed_duration,count_of_annotations, count_of_definitions, count_of_reviews, count_of_stories,create_date, status,topic_intro,topic_name,total_duration,lecture_id) VALUES ('FALSE', 30,0,0,0,0,'06-05-2022','OPEN', 'How to use switch','Switch',140,1)
INSERT INTO topics (is_deleted,completed_duration,count_of_annotations, count_of_definitions, count_of_reviews, count_of_stories,create_date, status,topic_intro,topic_name,total_duration,lecture_id) VALUES ('FALSE', 30,0,0,0,0,'06-05-2022','OPEN', 'pass the view in server','Controller',300,2)
INSERT INTO topics (is_deleted,completed_duration,count_of_annotations, count_of_definitions, count_of_reviews, count_of_stories,create_date, status,topic_intro,topic_name,total_duration,lecture_id) VALUES ('FALSE', 30,0,0,0,0,'06-05-2022','OPEN', 'FIFO Data structure','Linked List',300,3)
