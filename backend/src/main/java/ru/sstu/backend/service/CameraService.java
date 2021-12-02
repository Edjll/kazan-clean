package ru.sstu.backend.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.sstu.backend.entity.Camera;
import ru.sstu.backend.repository.CameraRepo;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CameraService {

    private final CameraRepo cameraRepo;

    public List<Camera> getAll() {
        return cameraRepo.findAll();
    }

    public Camera save(Camera camera) {
        return cameraRepo.save(camera);
    }

    public void deleteById(Camera camera) {
        cameraRepo.deleteById(camera.getId());
    }


}
