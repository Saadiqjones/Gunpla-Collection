package com.saj.mcip.gunplacollection.controller;

import com.saj.mcip.gunplacollection.model.dto.GunplaDto;
import com.saj.mcip.gunplacollection.service.GunplaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import static com.saj.mcip.gunplacollection.util.Util.toDto;
import static com.saj.mcip.gunplacollection.util.Util.toEntity;

@RestController
@RequestMapping("/gunpla")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class GunplaController {

    private final GunplaService gunplaService;

    @PostMapping("/")
    public GunplaDto create(@RequestBody final GunplaDto pDto) {
        return toDto(gunplaService.create(toEntity(pDto)));
    }

    @GetMapping("/{id}")
    public GunplaDto read(@PathVariable("id") final int pId) {
        return toDto(gunplaService.read(pId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND)));
    }

    @PutMapping("/{id}")
    public GunplaDto update(@PathVariable("id") final int pId, @RequestBody final GunplaDto pDto) {
        return toDto(gunplaService.update(pId,toEntity(pDto))
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND)));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") final int pId) {
        if (!gunplaService.delete(pId)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
