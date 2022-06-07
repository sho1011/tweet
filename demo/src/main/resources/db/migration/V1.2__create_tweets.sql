CREATE TABLE `tweets` (
    `tweet_id` CHAR(6) NOT NULL,
    `user_id` CHAR(4) NOT NULL,
    `name` CHAR(30) NOT NULL,
    `subject` VARCHAR(30) NOT NULL,
    `content` VARCHAR(100) NOT NULL,
    PRIMARY KEY (`tweet_id`)
);