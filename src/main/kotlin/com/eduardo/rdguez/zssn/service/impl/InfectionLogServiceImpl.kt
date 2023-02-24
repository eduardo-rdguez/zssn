package com.eduardo.rdguez.zssn.service.impl

import com.eduardo.rdguez.zssn.domain.InfectionLog
import com.eduardo.rdguez.zssn.domain.Survivor
import com.eduardo.rdguez.zssn.mapper.InfectionLogMapper
import com.eduardo.rdguez.zssn.repository.InfectionLogRepository
import com.eduardo.rdguez.zssn.service.InfectionLogService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional

@Service
class InfectionLogServiceImpl(
  private val infectionLogRepository: InfectionLogRepository,
) : InfectionLogService {

  @Transactional(propagation = Propagation.MANDATORY)
  override fun saveInfectionLog(speaker: Survivor, infected: Survivor) {
    val infectionLog: InfectionLog = InfectionLogMapper.toEntity(speaker, infected)
    infectionLogRepository.save(infectionLog)
  }

  @Transactional(readOnly = true)
  override fun countLogsBySurvivor(survivor: Survivor): Long {
    return infectionLogRepository.countByInfected(survivor)
  }

}