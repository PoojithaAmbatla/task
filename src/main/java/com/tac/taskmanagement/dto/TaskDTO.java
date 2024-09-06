package com.tac.taskmanagement.dto;

import lombok.Data;
@Data
public class TaskDTO {

        private Long id;
        private String name;
        private String task;
        private String status;
        private String logHours;
}
