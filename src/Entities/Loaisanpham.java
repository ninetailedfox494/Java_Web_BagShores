package Entities;
// Generated Dec 17, 2016 4:50:57 PM by Hibernate Tools 5.2.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Loaisanpham generated by hbm2java
 */
@Entity
@Table(name = "loaisanpham", catalog = "qlbantuisach")
public class Loaisanpham implements java.io.Serializable {

	private Integer maLoai;

	private String tenLoai;

	public Loaisanpham() {
	}

	public Loaisanpham(String tenLoai) {
		this.tenLoai = tenLoai;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "MaLoai", unique = true, nullable = false)
	public Integer getMaLoai() {
		return this.maLoai;
	}

	public void setMaLoai(Integer maLoai) {
		this.maLoai = maLoai;
	}

	@Column(name = "TenLoai", nullable = false, length = 100)
	public String getTenLoai() {
		return this.tenLoai;
	}

	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}

}