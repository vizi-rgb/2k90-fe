package com.vizirgb.backend2k90.controllers;

import com.vizirgb.backend2k90.services.SongsService;
import com.vizirgb.backend2k90.services.dto.SongDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/songs")
public class SongsController {

    private final SongsService songsService;

    @GetMapping("/{id}")
    public ResponseEntity<SongDTO> getSongById(@PathVariable Long id) {
        // TODO
        return ResponseEntity.noContent().build();
    }
}
