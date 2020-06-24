package org.gec.service;


import org.gec.pojo.Filminfo;
import org.gec.pojo.FilminfoExample;

import java.util.List;

public interface FilmInfoService {
    List<Filminfo> findAllInfo(Filminfo filminfo);

    void save(Filminfo filminfo);
}
