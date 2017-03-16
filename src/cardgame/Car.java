package cardgame;

public enum Car {
	DaimlerSix(1, 230, 1708, 3980, 6, 7.4),
	FordGranada(2, 172, 1205, 2293, 6, 12.4),
	LamborghiniCountach(3, 295, 1490, 5167, 12, 4.9),
	OpelMonza(4, 215, 1385, 2969, 6, 8.5),
	VWGolf2(5, 167, 870, 1595, 4, 11.3),
	AudiQuattro(6, 230, 1350, 2226, 5, 7.1),
	VolgaM24(7, 145, 1300, 2445, 4, 23.0),
	Zastava1100Confort(8, 143, 802, 1116, 4, 16.8),
	Peugeot205GTI(9, 206, 860, 1905, 4, 7.8),
	BMW525(10, 197, 1290, 2494, 6, 9.9),
	LotusEspritTurbo(11, 245, 1220, 2174, 4, 5.6),
	Trabant601(12, 110, 610, 595, 2, 36.8),
	PolskiFiat126(13, 105, 600, 652, 2, 38.0),
	ChevroletCamaro(14, 205, 1600, 5675, 8, 11.0),
	LanciaDeltaIntegrale(15, 220, 1260, 1995, 4, 5.7),
	FordSierra(16, 152, 997, 1294, 4, 18.1),
	ChevroletCorvette(17, 205, 1600, 5400, 8, 7.0),
	HondaPrelude(18, 165, 920, 1602, 4, 11.5),
	LadaNiva(19, 130, 1065, 1568, 4, 23.0),
	MercedesBenzW124(20, 180, 1490, 2996, 6, 14.6),
	ToyotaMR2(21, 197, 975, 1587, 4, 8.7),
	BMWM6(22, 245, 1583, 3453, 6, 6.5),
	MazdaMX5(23, 175, 965, 1598, 4, 10.6),
	Skoda130Rapid(24, 141, 915, 1174, 4, 16.5),
	FiatX19(25, 180, 914, 1498, 4, 10.4),
	Dacia1300(26, 145, 890, 1297, 4, 16.5),
	Porche928(27, 255, 1450, 4664, 8, 6.2),
	BitterCD(28, 220, 1750, 5400, 8, 9.9),
	SuzukiSamurai(29, 130, 930, 1298, 4, 14.9),
	Saab900Turbo(30, 195, 1240, 1985, 4, 9.0),
	Tatra613(31, 190, 1600, 3495, 8, 12.7),
	AlfaRomeoGTV6(32, 230, 1227, 2492, 6, 8.8);

	public int id;
	public int tSpeed;
	public int weight;
	public int displacement;
	public int cylinder;
	public double acceleration;

	private Car(int id, int tSpeed, int weight, int displacement, int cylinder, double acceleration)
	{
		this.id = id;
		this.tSpeed = tSpeed;
		this.weight = weight;
		this.displacement = displacement;
		this.cylinder = cylinder;
		this.acceleration = acceleration;
	}

	public int getId() {
		return id;
	}

	public String toString() {
		return "" + this.name() + ": TopSpeed: " + tSpeed + ", Weight: " + weight + ", Displacement: " + displacement + ", Cylinder: " + cylinder + ", Acceleration: " + acceleration;
	}
	
}
