package io.hamzaouni.moviecatalogservice.resources;

import io.hamzaouni.moviecatalogservice.models.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * @author Hamza Ouni
 */
@RestController
@RequestMapping("/catalog")
public class MovieCatalogueResource {

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {

        return Collections.singletonList(new CatalogItem("Transform","Test",1));

    }
}
