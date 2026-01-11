package guru.qa.photocatalog.service;

import guru.qa.photocatalog.domain.Photo;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

//video 12.1 31'
@Component
public class InMemoryPhotoService implements PhotoService{

  @Override
  public List<Photo> allPhotos() {
    return List.of(
            new Photo(
                    "Photo-1",
                    new Date(),
                    null
            ),
            new Photo(
                    "Photo-2",
                    new Date(),
                    null
            )
    );
  }

  @Override
  public Photo photoByDescription(String description) {
    return null;
  }
}
