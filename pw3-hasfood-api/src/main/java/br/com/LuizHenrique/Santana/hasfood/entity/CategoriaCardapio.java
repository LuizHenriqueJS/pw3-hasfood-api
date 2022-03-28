package br.com.LuizHenrique.Santana.hasfood.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.LuizHenrique.Santana.hasfood.enums.StatusEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="TBL_CATEGORIA_CARDAPIO")
public class CategoriaCardapio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CATEGORIA_CARDAPIO")
	private Long idCategoriaCardapio;
	
	@Column(name = "TX_NOME")
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "ID_CARDAPIO")
	private Cardapio idCardapio;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "TX_STATUS")
	private StatusEnum status;
}
