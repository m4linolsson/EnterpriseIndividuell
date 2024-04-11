package com.example.enterpriseindividuelllaboration.controllers;

import com.example.enterpriseindividuelllaboration.Services.MemberService;
import com.example.enterpriseindividuelllaboration.entities.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/admin")
public class MemberController {


    @Autowired
    private MemberService memberService;

    @GetMapping("/members")
    @ResponseBody
    public ResponseEntity getAllMembers() {
        return ResponseEntity.ok(memberService.getAllMembers());
    }

    @GetMapping(value = "/member/{id}")
    @ResponseBody
    public ResponseEntity getMemberById(@PathVariable("id") int id) {
        return ResponseEntity.ok(memberService.getMemberById(id));
    }

    @PutMapping("/updatemember")
    public ResponseEntity<Member> updateMember( @RequestBody Member member) {
        return ResponseEntity.ok(memberService.updateMember(member));
    }

    @PostMapping("/addmember")
    public ResponseEntity<Member> addNewMember(@RequestBody Member member) {
        return ResponseEntity.ok(memberService.addNewMember(member));
    }


    @DeleteMapping(value = "/deletemember/{id}")
    public ResponseEntity<String> deleteMemberById(@PathVariable("id") int id) {
        memberService.deleteMember(id);
        return ResponseEntity.ok("Member with id: " + id + " deleted");
    }

    @GetMapping(value = "/deletemember")
    public String getAllMembers(Model model) {
        model.addAttribute("members", memberService.getAllMembers());
        return "/member-list";
    }


    @GetMapping(value = "/deletememberbyid/{id}")
    public String deleteMember(@PathVariable("id") int id) {
        memberService.deleteMember(id);
       return "redirect:/admin/deletemember";
    }
}


