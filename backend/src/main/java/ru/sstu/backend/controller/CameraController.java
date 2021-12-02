package ru.sstu.backend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.sstu.backend.entity.Camera;
import ru.sstu.backend.service.CameraService;

import java.util.List;

@RestController("/cameras")
@RequiredArgsConstructor
public class CameraController {

    private final CameraService cameraService;


    @PostMapping
    public Camera createCamera(Camera camera){
        camera.setId(null);
        return cameraService.save(camera);
    }

    @GetMapping
    public List<Camera> getAll(){
        return cameraService.getAll();
    }

    @DeleteMapping
    public void delete(Camera camera){
        cameraService.deleteById(camera);
    }
    @PutMapping
    public Camera update(Camera camera){
        return cameraService.save(camera);
    }
}
