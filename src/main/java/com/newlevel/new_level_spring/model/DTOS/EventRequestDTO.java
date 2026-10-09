package com.newlevel.new_level_spring.model.DTOS;

import java.time.LocalDateTime;

import com.newlevel.new_level_spring.types.Category;
import com.newlevel.new_level_spring.types.Difficulty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventRequestDTO {
  private String title;
  private String description;
  private LocalDateTime startDate;
  private LocalDateTime endDate;
  private Category category;
  private Difficulty difficulty;
}