package com.example.demo.Servies;

import com.example.demo.Designer.Designer;
import com.example.demo.Designer.DesignerRepository;
import com.example.demo.Gallery.Gallery;
import com.example.demo.Gallery.GalleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiesServies {

    private final ServiesRepository serviesRepository;
    private final DesignerRepository designerRepository;
    private final GalleryRepository galleryRepository;

    @Autowired
    public ServiesServies(ServiesRepository serviesRepository, DesignerRepository designerRepository, GalleryRepository galleryRepository) {
        this.serviesRepository = serviesRepository;
        this.designerRepository = designerRepository;
        this.galleryRepository = galleryRepository;
}

    public List<Servies> getAllServies() {
    return  serviesRepository.findAll();

    }


    public Servies getServies(String id) {
    Long designer_id= Long.parseLong(id);
    return  serviesRepository.findById(designer_id).orElse(null);
    }

    public List<Servies> getServiesByDesignerId(String id) {
    List<Servies> allServices= serviesRepository.findAll();
    Long designer_id= Long.parseLong(id);
    List<Servies> servicesOfDesigner = new ArrayList<Servies>();
    for (Servies s : allServices){
        if(s.getDesigner().getId() == designer_id){
            servicesOfDesigner.add(s);
        }
    }
    return  servicesOfDesigner;
    }

//    public Servies addServies(Servies servies ,Long designer_id,Long gallery_id) {
    public Servies addServies(Servies servies) {

//    Designer d = designerRepository.findById(servies.getDesigner().getId()).orElse(null);
        System.out.println(servies);
//        Designer d = designerRepository.findById(servies.getDesigner().getId()).orElse(null);
//        System.out.println(d.getFullName());
//        Long id =servies.getDesigner().getId();
//        System.out.println("print here  "+id);
//        System.out.println(designerRepository.findAll());
//        Designer d = designerRepository.findById(id).orElse(null);
//        System.out.println(d);

//        System.out.println(d);
//            Designer designer = this. designerRepository.findById(designer_id).orElse(null);
//        System.out.println(designer);
//        System.out.println("designer Id = "+designer_id);
//        servies.setDesigner(designer);
//        Gallery gallery =this.galleryRepository.findById(gallery_id).orElse(null);
//        servies.setGallery(gallery);

    return serviesRepository.save(servies);
    }

   }




