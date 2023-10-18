package com.basic.mykomework.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CustomerResDTO{
        private Long id;
        private Long age;
        private String email;
        private String name;
        private LocalDateTime entryDate;
}
