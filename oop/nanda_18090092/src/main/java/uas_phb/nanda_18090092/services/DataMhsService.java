package uas_phb.nanda_18090092.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uas_phb.nanda_18090092.entity.DataMhs;
import uas_phb.nanda_18090092.model.DataMhsModel;
import uas_phb.nanda_18090092.repo.DataMhsRepo;

import java.util.List;
import java.util.Optional;

@Service
public class DataMhsService {

    @Autowired
    private DataMhsRepo repo;

    public List<DataMhs> getAllData() {
        return repo.findAll();
    }

    public DataMhs convertToEntity(DataMhsModel model) {
        DataMhs result = new DataMhs();
        result.setNim(model.getNim());
        result.setNama(model.getNama());
        result.setJurusan(model.getJurusan());
        result.setAlamat(model.getAlamat());
        return result;
    }

    public DataMhs save(DataMhs data) {
        return repo.save(data);
    }

    public Optional<DataMhs> findById(String nim) {
        return repo.findById(nim);
    }

    public void removeById(String nim) {
        repo.deleteById(nim);
    }

}