package com.eduardo.rdguez.zssn.service

import com.eduardo.rdguez.zssn.model.request.InfectionLogRequest

interface InfectionService {

  fun reportInfection(infectionLogRequest: InfectionLogRequest)

}