INSERT INTO roles(description,is_deleted) VALUES('Admin','FALSE')
INSERT INTO roles(description,is_deleted) VALUES('Teacher','FALSE')
INSERT INTO roles(description,is_deleted) VALUES('Mentor','FALSE')
INSERT INTO roles(description,is_deleted) VALUES('beDev','FALSE')

INSERT INTO users (enabled,first_name,gender,last_name,pass_word,user_name,phone,role_id,is_deleted) VALUES ('TRUE','Mehmet','MALE','Kal','initial','mehmetkal','11115180','1','FALSE')
INSERT INTO users (enabled,first_name,gender,last_name,pass_word,user_name,phone,role_id,is_deleted) VALUES ('TRUE','Ozzy','MALE','al','initial','ozzyall@cydeo.com','11115180','2','FALSE')
INSERT INTO users (enabled,first_name,gender,last_name,pass_word,user_name,phone,role_id,is_deleted) VALUES ('TRUE','FATMA','FEMALE','Merime','initial','fatma@cydeo.com','11115180','2','FALSE')
INSERT INTO users (enabled,first_name,gender,last_name,pass_word,user_name,phone,role_id,is_deleted) VALUES ('TRUE','Cundullah','MALE','Tal','initial','cundullah@cydeo.com','11115180','3','FALSE')
INSERT INTO users (enabled,first_name,gender,last_name,pass_word,user_name,phone,role_id,is_deleted) VALUES ('TRUE','Mehmet','MALE','Kal','initial','mehmetkaldev','11115180','4','FALSE')

INSERT INTO stories (definition,lecture,solution,status,topic,is_deleted) VALUES ('Creation of Relationship in Hibernate','JAVA SPRING','Use @OnetoOne, @OneToMany and @ManyToMany annotation','OPEN','ORM','FALSE')
INSERT INTO stories (definition,lecture,solution,status,topic,is_deleted) VALUES ('handling the Transaction in Spring','JAVA SPRING','Use @Transactional annotation','COMPLETE','ORM','FALSE')
INSERT INTO stories (definition,lecture,solution,status,topic,is_deleted) VALUES ('deleting something Database','JAVA SPRING DATA',' create a field isDeleted and use @Where annotation  and set it true','OPEN','ORM','FALSE')

INSERT INTO annotations (is_deleted,annotation,explanation,lecture,topic) VALUES ('FALSE', '@Controller','It is use above the controller class','JAVA SPRING','MVC')
INSERT INTO annotations (is_deleted,annotation,explanation,lecture,topic) VALUES ('FALSE', '@Component','Use class Level, use DI for creat bean or need a bean','JAVA SPRING','MVC')
INSERT INTO annotations (is_deleted,annotation,explanation,lecture,topic) VALUES ('FALSE', '@Service','It is use above the service impl class iot create a bean from service class','JAVA SPRING','MVC')

