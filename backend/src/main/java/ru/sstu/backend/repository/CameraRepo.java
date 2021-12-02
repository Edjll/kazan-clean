package ru.sstu.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sstu.backend.entity.Camera;

public interface CameraRepo extends JpaRepository<Camera,Integer> {

}
