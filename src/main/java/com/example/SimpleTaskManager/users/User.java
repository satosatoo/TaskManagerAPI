package com.example.SimpleTaskManager.users;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
}
