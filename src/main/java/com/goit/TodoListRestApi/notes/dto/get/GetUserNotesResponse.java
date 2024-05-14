package com.goit.TodoListRestApi.notes.dto.get;

import com.goit.TodoListRestApi.notes.Note;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class GetUserNotesResponse {
    private Error error;

    private List<Note> userNotes;

    public enum Error {
        ok,
        emptyList
    }

    public static GetUserNotesResponse success(List<Note> userNotes) {
        return builder()
                .error(Error.ok)
                .userNotes(userNotes)
                .build();
    }

    public static GetUserNotesResponse failed(Error error) {
        return builder()
                .error(error)
                .userNotes(null)
                .build();
    }
}
