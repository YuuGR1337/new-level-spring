package com.newlevel.new_level_spring.model.DTOS;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubtaskResponseDTO {
  private Long id;
  private String title;
  private Boolean isCompleted;
  private LocalDateTime completedAt;
}