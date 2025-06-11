package vn.hienht.hienht_example_code.controller;

import org.springframework.web.bind.annotation.*;
import vn.hienht.hienht_example_code.dto.request.UserRequestDTO;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/")
    public String addUser(@RequestBody UserRequestDTO user) {
        return "Đã thêm " + user.getFirstName() + " " + user.getLastName();
    }

    @PutMapping("/{userId}")
    public String updateUser(@PathVariable int userId, @RequestBody UserRequestDTO user) {
        System.out.printf("Request update userId : " + userId);
        return "Đã sửa " + userId + " " + user.getFirstName() + " " + user.getLastName();
    }

    @PatchMapping("/{userId}")
    public String changeStatus(@PathVariable int userId, @RequestParam(required = false) boolean status) {
        System.out.printf(userId + "change status : " + status);
        return "Change status";
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable int userId) {
        return "Đã xóa " + userId + " " + true;
    }

    @GetMapping("/{userId}")
    public UserRequestDTO findUserById(@PathVariable int userId) {
        System.out.printf("Request findUserById : " + userId);
        return new UserRequestDTO("hoang", "hien", "0123123", "hienht@mail");
    }

    @GetMapping("getList")
    public List<UserRequestDTO> getList() {
        return List.of(new UserRequestDTO("hoang", "hien", "0123123", "hienht@mail"),
                new UserRequestDTO("hoang", "hien", "0123123", "hienht@mail"));
    }
}
