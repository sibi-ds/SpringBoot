CREATE TABLE `demo`.`question` (
    `question_id` BIGINT AUTO_INCREMENT ,
    `question` VARCHAR(145),
    `created_at` DATETIME DEFAULT NULL,
    `updated_at` DATETIME DEFAULT NULL,
    PRIMARY KEY (`question_id`)
);

CREATE TABLE `demo`.`answer` (
    `answer_id` BIGINT AUTO_INCREMENT ,
    `answer` VARCHAR(45),
    `created_at` DATETIME DEFAULT NULL,
    `updated_at` DATETIME DEFAULT NULL,
    PRIMARY KEY (`answer_id`),
    `question_id` BIGINT,
    FOREIGN KEY (`question_id`) REFERENCES `question`(`question_id`)
);