package _02_multiGenerics;

// 내맘대로 넣을수 있음
public class Product<K, M> {
	private K kind;
	private M model;

	public K getKind() {
		return kind;
	}

	public M getModel() {
		return model;
	}

	public void setModel(M model) {
		this.model = model;
	}

	public void setKind(K kind) {
		this.kind = kind;
	}

}
