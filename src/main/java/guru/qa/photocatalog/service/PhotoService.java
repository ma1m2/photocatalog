package guru.qa.photocatalog.service;

import guru.qa.photocatalog.domain.Photo;
import guru.qa.photocatalog.domain.graphql.PhotoGql;
import guru.qa.photocatalog.domain.graphql.PhotoInputGql;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

import java.util.List;

public interface PhotoService {

  List<Photo> allPhotos();

  List<PhotoGql> allGqlPhotos();

  Slice<Photo> allPhotos(Pageable pageable);

  Slice<PhotoGql> allGqlPhotos(Pageable pageable);

  Photo photoByDescription(String description);

  Photo photoById(String id);

  Photo addPhoto(Photo photo);

  PhotoGql addPhotoGql(PhotoInputGql photoGql);

  PhotoGql photoGqlById(String id);
}
