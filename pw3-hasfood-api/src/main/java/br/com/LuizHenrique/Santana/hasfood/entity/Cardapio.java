package br.com.LuizHenrique.Santana.hasfood.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="TBL_CARDAPIO")
public class Cardapio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CARDAPIO")
	private Long idCardapio;
	
	@Column(name = "ID_RESTAURANTE")
	private Long idRestaurante;
}
