package com.eduardo.rdguez.zssn.service.impl

import com.eduardo.rdguez.zssn.model.response.InfectionsResponse
import com.eduardo.rdguez.zssn.service.ReportService
import com.eduardo.rdguez.zssn.service.SurvivorInventoryService
import com.eduardo.rdguez.zssn.service.SurvivorService
import com.eduardo.rdguez.zssn.util.ArithmeticUtil
import org.springframework.stereotype.Service

@Service
class ReportServiceImpl(
  private val survivorService: SurvivorService,
  private val survivorInventoryService: SurvivorInventoryService
) : ReportService {

  override fun findInfections(): InfectionsResponse {
    val uninfected: Int = survivorService.countAllUninfected()
    val infected: Int = survivorService.countAllInfected()
    val percentage: String = ArithmeticUtil.percentage(
      infected.toDouble(),
      uninfected.toDouble(),
    )

    return InfectionsResponse(
      survivors = uninfected,
      infections = infected,
      percentage = percentage
    )
  }

}