INSERT INTO roles(description,is_deleted) VALUES('Admin','FALSE')
INSERT INTO roles(description,is_deleted) VALUES('Teacher','FALSE')
INSERT INTO roles(description,is_deleted) VALUES('Mentor','FALSE')
INSERT INTO roles(description,is_deleted) VALUES('beDev','FALSE')

INSERT INTO users (enabled,first_name,gender,last_name,pass_word,user_name,phone,role_id,is_deleted) VALUES ('TRUE','Mehmet','MALE','Kal','initial','mehmetkal','11115180','1','FALSE')
INSERT INTO users (enabled,first_name,gender,last_name,pass_word,user_name,phone,role_id,is_deleted) VALUES ('TRUE','Ozzy','MALE','al','initial','ozzyall@cydeo.com','11115180','2','FALSE')
INSERT INTO users (enabled,first_name,gender,last_name,pass_word,user_name,phone,role_id,is_deleted) VALUES ('TRUE','FATMA','FEMALE','Merime','initial','fatma@cydeo.com','11115180','2','FALSE')
INSERT INTO users (enabled,first_name,gender,last_name,pass_word,user_name,phone,role_id,is_deleted) VALUES ('TRUE','Cundullah','MALE','Tal','initial','cundullah@cydeo.com','11115180','3','FALSE')
INSERT INTO users (enabled,first_name,gender,last_name,pass_word,user_name,phone,role_id,is_deleted) VALUES ('TRUE','Mehmet','MALE','Kal','initial','mehmetkaldev','11115180','4','FALSE')

INSERT INTO lectures (is_deleted,completed_duration,count_of_topics,expected_duration,lecture_name,lecture_level) VALUES ('FALSE', 0, 0,6000,'JAVA SPRING BOOT','BEGINNER')
INSERT INTO topics (is_deleted,completed_duration,status,topic_intro,topic_name,total_duration,lecture_id) VALUES ('FALSE', 0,'OPEN', 'loops helps','Loops',300,1)