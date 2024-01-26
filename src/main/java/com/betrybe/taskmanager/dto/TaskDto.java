package com.betrybe.taskmanager.dto;

/**
 * Task Dto class.
 */
public record TaskDto(
    String id,
    String title,
    String description,
    String ownerName,
    Boolean isComplete) {

}

