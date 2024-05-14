package com.goit.TodoListRestApi.notes.dto.update;

import lombok.Data;

@Data
public class UpdateNoteRequest {
    private long id;
    private String title;
    private String content;
}
