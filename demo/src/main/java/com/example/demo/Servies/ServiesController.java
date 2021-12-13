package com.example.demo.Servies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="services")
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
        System.out.println(id);
    return serviesServies.getServies(id);
    }

    @PostMapping
    public Servies addServies(@RequestBody Servies s){
//        System.out.println(form.getTitle());
//        System.out.println(form.getServies().getServiesID());
//        return null;
//
//        System.out.println(form.getServies() );
//
//        System.out.println( "name is "+s.getDesigner().getFullName());
//        System.out.println( form.getGalleryId());
//        System.out.println(s);
        return  serviesServies.addServies(s);

    }
//    @GetMapping("/{id}")
//    public List<Servies> getAllServiesByDesigner(@PathVariable String id){
//    return serviesServies.getAllServiesByDesigner(id);
//    }
//    @PostMapping
//    public Servies addServies(@RequestBody Servies servies ,Long designerId,Long galleryId){
//    return   serviesServies.addServies()
//    }

}
class Form {
    private Servies servies;
    private Long designerId;
    private Long galleryId;

    public Servies getServies() {
        return servies;
    }
    public Long getDesignerId() {
        return designerId;
    }
    public Long getGalleryId() {
        return galleryId;
    }

}

/// /   {
//  "servicies":{
//    "title":"ffgghj",
//    "description":"fghjkl;",
//    "duration":"2020-12-03",
//    "price":200,
//    "type":"rtyy"
//    },
//   "Designers":{ "id" : 2},
//    "Galleries":{ "id" : 3}
//
//}

//{
//  "servicies":{
//    "title":"ffgghj",
//    "description":"fghjkl;",
//    "duration":"2020-12-03",
//    "price":200,
//    "type":"rtyy"
//    },
//    "designerId" : 2,
//    "galleryId" : 3
//}
