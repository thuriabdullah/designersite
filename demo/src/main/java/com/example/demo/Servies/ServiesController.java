package com.example.demo.Servies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="sevices")
public class ServiesController {
    private final ServiesServies serviesServies;
@Autowired
    public ServiesController(ServiesServies serviesServies) {
        this.serviesServies = serviesServies;
    }
    @GetMapping
    public List<Servies> getAllServies(){
        return  serviesServies.getAllServies();
    }
    @GetMapping("/{id}")
    public Servies getServies(@PathVariable String id){
        return serviesServies.getServies(id);
    }
    @PostMapping
    public Servies addServies(@RequestBody Form form ){
//        System.out.println(form.getTitle());
        return  serviesServies.addServies(form.getServies(),form.getDesignerNumber(),form.getGalleryID());

    }
    @GetMapping("/{id}")
    public List<Servies> getAllServiesByDesigner(@PathVariable String id){
    return serviesServies.getAllServiesByDesigner(id);
    }



}
class Form {
    private Servies servies;
    private Long designerNumber;
    private Long galleryID ;

    public Form(Servies servies, Long designerNumber, Long galleryID) {
        this.servies = servies;
        this.designerNumber = designerNumber;
        this.galleryID = galleryID;
    }

    public Servies getServies() {
        return servies;
    }



    public Long getDesignerNumber() {
        return designerNumber;
    }



    public Long getGalleryID() {
        return galleryID;
    }


}

