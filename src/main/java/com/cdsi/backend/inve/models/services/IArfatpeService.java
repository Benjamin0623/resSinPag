package com.cdsi.backend.inve.models.services;

import java.util.List;

import com.cdsi.backend.inve.models.entity.Arfatpe;
import com.cdsi.backend.inve.models.entity.IdArfatpe;

public interface IArfatpeService {
	Arfatpe findByIdArfatpe(IdArfatpe objIdArfa);
	List<Arfatpe> listarTransacXCia(String cia);
}
