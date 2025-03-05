package com.saj.mcip.gunplacollection.controller;

import com.saj.mcip.gunplacollection.model.dto.MemberDto;
import com.saj.mcip.gunplacollection.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import static com.saj.mcip.gunplacollection.util.Util.toDto;
import static com.saj.mcip.gunplacollection.util.Util.toEntity;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/")
    public MemberDto create(@RequestBody final MemberDto pDto) {
        return toDto(memberService.create(toEntity(pDto)));
    }

    @GetMapping("/{id}")
    public MemberDto read(@PathVariable("id") final int pId) {
        return toDto(memberService.read(pId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND)));
    }

    @PutMapping("/{id}")
    public MemberDto update(@PathVariable("id") final int pId,
                            @RequestBody final MemberDto pDto) {
        return toDto(memberService.update(pId, toEntity(pDto))
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND)));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") final int pId) {
        if(!memberService.delete(pId)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
