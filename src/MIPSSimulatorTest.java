import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MIPSAssemblerTest {

	@Test
	public void test1() {
		String hexCode = "02b4e822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 15, rt: 14, rd: 1d, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test2() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test3() {
		String hexCode = "027b4822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 13, rt: 1b, rd: 09, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test4() {
		String hexCode = "3413ff20";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 00, rt: 13, immediate(offset): ff20}", actualInstruction);
	}
	@Test
	public void test5() {
		String hexCode = "117e00df";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 0b, rt: 1e, immediate(offset): 00df}", actualInstruction);
	}
	@Test
	public void test6() {
		String hexCode = "030a0820";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 18, rt: 0a, rd: 01, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test7() {
		String hexCode = "136affae";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 1b, rt: 0a, immediate(offset): ffae}", actualInstruction);
	}
	@Test
	public void test8() {
		String hexCode = "10440017";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 02, rt: 04, immediate(offset): 0017}", actualInstruction);
	}
	@Test
	public void test9() {
		String hexCode = "080000cd";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 00000cd}", actualInstruction);
	}
	@Test
	public void test10() {
		String hexCode = "ae940000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 14, rt: 14, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test11() {
		String hexCode = "375300ae";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 1a, rt: 13, immediate(offset): 00ae}", actualInstruction);
	}
	@Test
	public void test12() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test13() {
		String hexCode = "00dfe02a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 06, rt: 1f, rd: 1c, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test14() {
		String hexCode = "0800008c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 000008c}", actualInstruction);
	}
	@Test
	public void test15() {
		String hexCode = "1273ffe7";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 13, rt: 13, immediate(offset): ffe7}", actualInstruction);
	}
	@Test
	public void test16() {
		String hexCode = "03dc0025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 1e, rt: 1c, rd: 00, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test17() {
		String hexCode = "10c900cd";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 06, rt: 09, immediate(offset): 00cd}", actualInstruction);
	}
	@Test
	public void test18() {
		String hexCode = "274700c3";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 1a, rt: 07, immediate(offset): 00c3}", actualInstruction);
	}
	@Test
	public void test19() {
		String hexCode = "02f43824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 17, rt: 14, rd: 07, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test20() {
		String hexCode = "aeed0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 17, rt: 0d, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test21() {
		String hexCode = "16cb00aa";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 16, rt: 0b, immediate(offset): 00aa}", actualInstruction);
	}
	@Test
	public void test22() {
		String hexCode = "0103b824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 08, rt: 03, rd: 17, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test23() {
		String hexCode = "3c1d0071";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 1d, immediate(offset): 0071}", actualInstruction);
	}
	@Test
	public void test24() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test25() {
		String hexCode = "25c6004d";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 0e, rt: 06, immediate(offset): 004d}", actualInstruction);
	}
	@Test
	public void test26() {
		String hexCode = "32110039";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 10, rt: 11, immediate(offset): 0039}", actualInstruction);
	}
	@Test
	public void test27() {
		String hexCode = "0161c822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 0b, rt: 01, rd: 19, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test28() {
		String hexCode = "03bad020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 1d, rt: 1a, rd: 1a, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test29() {
		String hexCode = "33b9ff27";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 1d, rt: 19, immediate(offset): ff27}", actualInstruction);
	}
	@Test
	public void test30() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test31() {
		String hexCode = "0800002e";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 000002e}", actualInstruction);
	}
	@Test
	public void test32() {
		String hexCode = "3c08004f";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 08, immediate(offset): 004f}", actualInstruction);
	}
	@Test
	public void test33() {
		String hexCode = "038b2024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 1c, rt: 0b, rd: 04, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test34() {
		String hexCode = "0398802a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 1c, rt: 18, rd: 10, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test35() {
		String hexCode = "25fe0085";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 0f, rt: 1e, immediate(offset): 0085}", actualInstruction);
	}
	@Test
	public void test36() {
		String hexCode = "24e900d4";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 07, rt: 09, immediate(offset): 00d4}", actualInstruction);
	}
	@Test
	public void test37() {
		String hexCode = "080000ef";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 00000ef}", actualInstruction);
	}
	@Test
	public void test38() {
		String hexCode = "3c030054";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 03, immediate(offset): 0054}", actualInstruction);
	}
	@Test
	public void test39() {
		String hexCode = "271500d5";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 18, rt: 15, immediate(offset): 00d5}", actualInstruction);
	}
	@Test
	public void test40() {
		String hexCode = "3134fffe";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 09, rt: 14, immediate(offset): fffe}", actualInstruction);
	}
	@Test
	public void test41() {
		String hexCode = "309d00ea";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 04, rt: 1d, immediate(offset): 00ea}", actualInstruction);
	}
	@Test
	public void test42() {
		String hexCode = "0140a820";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 0a, rt: 00, rd: 15, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test43() {
		String hexCode = "01082020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 08, rt: 08, rd: 04, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test44() {
		String hexCode = "035ca020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 1a, rt: 1c, rd: 14, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test45() {
		String hexCode = "ac0d0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 00, rt: 0d, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test46() {
		String hexCode = "03a40020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 1d, rt: 04, rd: 00, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test47() {
		String hexCode = "8fb20000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 1d, rt: 12, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test48() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test49() {
		String hexCode = "03918824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 1c, rt: 11, rd: 11, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test50() {
		String hexCode = "3c01003d";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 01, immediate(offset): 003d}", actualInstruction);
	}
	@Test
	public void test51() {
		String hexCode = "00a7f82a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 05, rt: 07, rd: 1f, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test52() {
		String hexCode = "03518025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 1a, rt: 11, rd: 10, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test53() {
		String hexCode = "3c1400af";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 14, immediate(offset): 00af}", actualInstruction);
	}
	@Test
	public void test54() {
		String hexCode = "0143b022";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 0a, rt: 03, rd: 16, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test55() {
		String hexCode = "0800006c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 000006c}", actualInstruction);
	}
	@Test
	public void test56() {
		String hexCode = "35fdff2c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 0f, rt: 1d, immediate(offset): ff2c}", actualInstruction);
	}
	@Test
	public void test57() {
		String hexCode = "080000ff";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 00000ff}", actualInstruction);
	}
	@Test
	public void test58() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test59() {
		String hexCode = "0245b824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 12, rt: 05, rd: 17, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test60() {
		String hexCode = "3c14000d";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 14, immediate(offset): 000d}", actualInstruction);
	}
	@Test
	public void test61() {
		String hexCode = "3610ff4d";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 10, rt: 10, immediate(offset): ff4d}", actualInstruction);
	}
	@Test
	public void test62() {
		String hexCode = "245a00cf";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 02, rt: 1a, immediate(offset): 00cf}", actualInstruction);
	}
	@Test
	public void test63() {
		String hexCode = "027e0020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 13, rt: 1e, rd: 00, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test64() {
		String hexCode = "34e2ff24";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 07, rt: 02, immediate(offset): ff24}", actualInstruction);
	}
	@Test
	public void test65() {
		String hexCode = "0260f024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 13, rt: 00, rd: 1e, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test66() {
		String hexCode = "001c1820";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 00, rt: 1c, rd: 03, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test67() {
		String hexCode = "080000e4";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 00000e4}", actualInstruction);
	}
	@Test
	public void test68() {
		String hexCode = "ad6f0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 0b, rt: 0f, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test69() {
		String hexCode = "02bfc820";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 15, rt: 1f, rd: 19, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test70() {
		String hexCode = "080000a0";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 00000a0}", actualInstruction);
	}
	@Test
	public void test71() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test72() {
		String hexCode = "12d3ff02";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 16, rt: 13, immediate(offset): ff02}", actualInstruction);
	}
	@Test
	public void test73() {
		String hexCode = "27770089";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 1b, rt: 17, immediate(offset): 0089}", actualInstruction);
	}
	@Test
	public void test74() {
		String hexCode = "03ec782a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 1f, rt: 0c, rd: 0f, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test75() {
		String hexCode = "3c180093";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 18, immediate(offset): 0093}", actualInstruction);
	}
	@Test
	public void test76() {
		String hexCode = "12ecff0e";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 17, rt: 0c, immediate(offset): ff0e}", actualInstruction);
	}
	@Test
	public void test77() {
		String hexCode = "33630001";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 1b, rt: 03, immediate(offset): 0001}", actualInstruction);
	}
	@Test
	public void test78() {
		String hexCode = "0398c022";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 1c, rt: 18, rd: 18, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test79() {
		String hexCode = "25e40023";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 0f, rt: 04, immediate(offset): 0023}", actualInstruction);
	}
	@Test
	public void test80() {
		String hexCode = "03d90822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 1e, rt: 19, rd: 01, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test81() {
		String hexCode = "136900bc";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 1b, rt: 09, immediate(offset): 00bc}", actualInstruction);
	}
	@Test
	public void test82() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test83() {
		String hexCode = "03a91024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 1d, rt: 09, rd: 02, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test84() {
		String hexCode = "0179b825";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 0b, rt: 19, rd: 17, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test85() {
		String hexCode = "02d5282a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 16, rt: 15, rd: 05, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test86() {
		String hexCode = "0800005e";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 000005e}", actualInstruction);
	}
	@Test
	public void test87() {
		String hexCode = "024da025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 12, rt: 0d, rd: 14, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test88() {
		String hexCode = "03353022";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 19, rt: 15, rd: 06, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test89() {
		String hexCode = "ac270000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 01, rt: 07, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test90() {
		String hexCode = "1004ffb1";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 00, rt: 04, immediate(offset): ffb1}", actualInstruction);
	}
	@Test
	public void test91() {
		String hexCode = "aec50000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 16, rt: 05, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test92() {
		String hexCode = "10fdffaf";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 07, rt: 1d, immediate(offset): ffaf}", actualInstruction);
	}
	@Test
	public void test93() {
		String hexCode = "114300a4";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 0a, rt: 03, immediate(offset): 00a4}", actualInstruction);
	}
	@Test
	public void test94() {
		String hexCode = "34c3ff64";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 06, rt: 03, immediate(offset): ff64}", actualInstruction);
	}
	@Test
	public void test95() {
		String hexCode = "27b7000d";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 1d, rt: 17, immediate(offset): 000d}", actualInstruction);
	}
	@Test
	public void test96() {
		String hexCode = "26fa0064";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 17, rt: 1a, immediate(offset): 0064}", actualInstruction);
	}
	@Test
	public void test97() {
		String hexCode = "156bffd9";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 0b, rt: 0b, immediate(offset): ffd9}", actualInstruction);
	}
	@Test
	public void test98() {
		String hexCode = "3c150045";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 15, immediate(offset): 0045}", actualInstruction);
	}
	@Test
	public void test99() {
		String hexCode = "0036602a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 01, rt: 16, rd: 0c, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test100() {
		String hexCode = "34e9ff9e";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 07, rt: 09, immediate(offset): ff9e}", actualInstruction);
	}
	@Test
	public void test101() {
		String hexCode = "31aaffee";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 0d, rt: 0a, immediate(offset): ffee}", actualInstruction);
	}
	@Test
	public void test102() {
		String hexCode = "026e5024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 13, rt: 0e, rd: 0a, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test103() {
		String hexCode = "0800007a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 000007a}", actualInstruction);
	}
	@Test
	public void test104() {
		String hexCode = "0175a824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 0b, rt: 15, rd: 15, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test105() {
		String hexCode = "3703ffa6";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 18, rt: 03, immediate(offset): ffa6}", actualInstruction);
	}
	@Test
	public void test106() {
		String hexCode = "37340077";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 19, rt: 14, immediate(offset): 0077}", actualInstruction);
	}
	@Test
	public void test107() {
		String hexCode = "03144025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 18, rt: 14, rd: 08, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test108() {
		String hexCode = "02c2b025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 16, rt: 02, rd: 16, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test109() {
		String hexCode = "3c150060";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 15, immediate(offset): 0060}", actualInstruction);
	}
	@Test
	public void test110() {
		String hexCode = "130c00d2";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 18, rt: 0c, immediate(offset): 00d2}", actualInstruction);
	}
	@Test
	public void test111() {
		String hexCode = "8edd0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 16, rt: 1d, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test112() {
		String hexCode = "ae240000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 11, rt: 04, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test113() {
		String hexCode = "8ddf0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 0e, rt: 1f, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test114() {
		String hexCode = "0264a825";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 13, rt: 04, rd: 15, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test115() {
		String hexCode = "007dc025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 03, rt: 1d, rd: 18, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test116() {
		String hexCode = "329affc0";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 14, rt: 1a, immediate(offset): ffc0}", actualInstruction);
	}
	@Test
	public void test117() {
		String hexCode = "105aff45";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 02, rt: 1a, immediate(offset): ff45}", actualInstruction);
	}
	@Test
	public void test118() {
		String hexCode = "36de0071";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 16, rt: 1e, immediate(offset): 0071}", actualInstruction);
	}
	@Test
	public void test119() {
		String hexCode = "31b900f0";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 0d, rt: 19, immediate(offset): 00f0}", actualInstruction);
	}
	@Test
	public void test120() {
		String hexCode = "026df822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 13, rt: 0d, rd: 1f, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test121() {
		String hexCode = "0367102a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 1b, rt: 07, rd: 02, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test122() {
		String hexCode = "ac690000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 03, rt: 09, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test123() {
		String hexCode = "01c40822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 0e, rt: 04, rd: 01, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test124() {
		String hexCode = "01695020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 0b, rt: 09, rd: 0a, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test125() {
		String hexCode = "3c11006a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 11, immediate(offset): 006a}", actualInstruction);
	}
	@Test
	public void test126() {
		String hexCode = "acf20000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 07, rt: 12, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test127() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test128() {
		String hexCode = "01408022";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 0a, rt: 00, rd: 10, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test129() {
		String hexCode = "00a40024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 05, rt: 04, rd: 00, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test130() {
		String hexCode = "00f8a825";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 07, rt: 18, rd: 15, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test131() {
		String hexCode = "0158182a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 0a, rt: 18, rd: 03, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test132() {
		String hexCode = "3c010081";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 01, immediate(offset): 0081}", actualInstruction);
	}
	@Test
	public void test133() {
		String hexCode = "323400f6";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 11, rt: 14, immediate(offset): 00f6}", actualInstruction);
	}
	@Test
	public void test134() {
		String hexCode = "3c16000a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 16, immediate(offset): 000a}", actualInstruction);
	}
	@Test
	public void test135() {
		String hexCode = "009ed024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 04, rt: 1e, rd: 1a, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test136() {
		String hexCode = "08000030";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 0000030}", actualInstruction);
	}
	@Test
	public void test137() {
		String hexCode = "08000029";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 0000029}", actualInstruction);
	}
	@Test
	public void test138() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test139() {
		String hexCode = "000ab820";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 00, rt: 0a, rd: 17, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test140() {
		String hexCode = "ae85ff94";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 14, rt: 05, immediate(offset): ff94}", actualInstruction);
	}
	@Test
	public void test141() {
		String hexCode = "8e0b00bc";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 10, rt: 0b, immediate(offset): 00bc}", actualInstruction);
	}
	@Test
	public void test142() {
		String hexCode = "00101024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 00, rt: 10, rd: 02, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test143() {
		String hexCode = "0311d824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 18, rt: 11, rd: 1b, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test144() {
		String hexCode = "af9a0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 1c, rt: 1a, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test145() {
		String hexCode = "027dd82a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 13, rt: 1d, rd: 1b, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test146() {
		String hexCode = "359f00bb";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 0c, rt: 1f, immediate(offset): 00bb}", actualInstruction);
	}
	@Test
	public void test147() {
		String hexCode = "00118022";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 00, rt: 11, rd: 10, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test148() {
		String hexCode = "8c930000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 04, rt: 13, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test149() {
		String hexCode = "34750072";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 03, rt: 15, immediate(offset): 0072}", actualInstruction);
	}
	@Test
	public void test150() {
		String hexCode = "08000002";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 0000002}", actualInstruction);
	}
	@Test
	public void test151() {
		String hexCode = "3c0e0070";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 0e, immediate(offset): 0070}", actualInstruction);
	}
	@Test
	public void test152() {
		String hexCode = "030a9824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 18, rt: 0a, rd: 13, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test153() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test154() {
		String hexCode = "02068020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 10, rt: 06, rd: 10, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test155() {
		String hexCode = "02864820";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 14, rt: 06, rd: 09, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test156() {
		String hexCode = "307c0071";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 03, rt: 1c, immediate(offset): 0071}", actualInstruction);
	}
	@Test
	public void test157() {
		String hexCode = "03de4825";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 1e, rt: 1e, rd: 09, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test158() {
		String hexCode = "02a1e822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 15, rt: 01, rd: 1d, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test159() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test160() {
		String hexCode = "ad9dff58";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 0c, rt: 1d, immediate(offset): ff58}", actualInstruction);
	}
	@Test
	public void test161() {
		String hexCode = "3577ff30";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 0b, rt: 17, immediate(offset): ff30}", actualInstruction);
	}
	@Test
	public void test162() {
		String hexCode = "02375020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 11, rt: 17, rd: 0a, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test163() {
		String hexCode = "8d81ff91";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 0c, rt: 01, immediate(offset): ff91}", actualInstruction);
	}
	@Test
	public void test164() {
		String hexCode = "8c760000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 03, rt: 16, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test165() {
		String hexCode = "af700000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 1b, rt: 10, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test166() {
		String hexCode = "0130c022";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 09, rt: 10, rd: 18, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test167() {
		String hexCode = "0268f020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 13, rt: 08, rd: 1e, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test168() {
		String hexCode = "ae2000c8";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 11, rt: 00, immediate(offset): 00c8}", actualInstruction);
	}
	@Test
	public void test169() {
		String hexCode = "316cff18";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 0b, rt: 0c, immediate(offset): ff18}", actualInstruction);
	}
	@Test
	public void test170() {
		String hexCode = "0271982a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 13, rt: 11, rd: 13, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test171() {
		String hexCode = "080000f5";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 00000f5}", actualInstruction);
	}
	@Test
	public void test172() {
		String hexCode = "03144025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 18, rt: 14, rd: 08, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test173() {
		String hexCode = "3c0e0053";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 0e, immediate(offset): 0053}", actualInstruction);
	}
	@Test
	public void test174() {
		String hexCode = "30870057";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 04, rt: 07, immediate(offset): 0057}", actualInstruction);
	}
	@Test
	public void test175() {
		String hexCode = "8c08ff81";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 00, rt: 08, immediate(offset): ff81}", actualInstruction);
	}
	@Test
	public void test176() {
		String hexCode = "2641005c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 12, rt: 01, immediate(offset): 005c}", actualInstruction);
	}
	@Test
	public void test177() {
		String hexCode = "080000b7";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 00000b7}", actualInstruction);
	}
	@Test
	public void test178() {
		String hexCode = "00353025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 01, rt: 15, rd: 06, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test179() {
		String hexCode = "3378ff76";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 1b, rt: 18, immediate(offset): ff76}", actualInstruction);
	}
	@Test
	public void test180() {
		String hexCode = "005a9024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 02, rt: 1a, rd: 12, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test181() {
		String hexCode = "003d682a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 01, rt: 1d, rd: 0d, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test182() {
		String hexCode = "02cfd824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 16, rt: 0f, rd: 1b, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test183() {
		String hexCode = "028e1824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 14, rt: 0e, rd: 03, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test184() {
		String hexCode = "35b8ff04";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 0d, rt: 18, immediate(offset): ff04}", actualInstruction);
	}
	@Test
	public void test185() {
		String hexCode = "02776822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 13, rt: 17, rd: 0d, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test186() {
		String hexCode = "023b6020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 11, rt: 1b, rd: 0c, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test187() {
		String hexCode = "313b0021";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 09, rt: 1b, immediate(offset): 0021}", actualInstruction);
	}
	@Test
	public void test188() {
		String hexCode = "3748ffe0";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 1a, rt: 08, immediate(offset): ffe0}", actualInstruction);
	}
	@Test
	public void test189() {
		String hexCode = "08000044";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 0000044}", actualInstruction);
	}
	@Test
	public void test190() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test191() {
		String hexCode = "24d20060";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 06, rt: 12, immediate(offset): 0060}", actualInstruction);
	}
	@Test
	public void test192() {
		String hexCode = "0800005e";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 000005e}", actualInstruction);
	}
	@Test
	public void test193() {
		String hexCode = "024fa822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 12, rt: 0f, rd: 15, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test194() {
		String hexCode = "0800002a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 000002a}", actualInstruction);
	}
	@Test
	public void test195() {
		String hexCode = "3004ffa1";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 00, rt: 04, immediate(offset): ffa1}", actualInstruction);
	}
	@Test
	public void test196() {
		String hexCode = "037b8820";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 1b, rt: 1b, rd: 11, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test197() {
		String hexCode = "3640008c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 12, rt: 00, immediate(offset): 008c}", actualInstruction);
	}
	@Test
	public void test198() {
		String hexCode = "3c0200ed";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 02, immediate(offset): 00ed}", actualInstruction);
	}
	@Test
	public void test199() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test200() {
		String hexCode = "018b8020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 0c, rt: 0b, rd: 10, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test201() {
		String hexCode = "36da0060";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 16, rt: 1a, immediate(offset): 0060}", actualInstruction);
	}
	@Test
	public void test202() {
		String hexCode = "033a7820";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 19, rt: 1a, rd: 0f, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test203() {
		String hexCode = "3c1f00f3";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 1f, immediate(offset): 00f3}", actualInstruction);
	}
	@Test
	public void test204() {
		String hexCode = "03394025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 19, rt: 19, rd: 08, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test205() {
		String hexCode = "01359824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 09, rt: 15, rd: 13, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test206() {
		String hexCode = "1429000b";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 01, rt: 09, immediate(offset): 000b}", actualInstruction);
	}
	@Test
	public void test207() {
		String hexCode = "34d6008e";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 06, rt: 16, immediate(offset): 008e}", actualInstruction);
	}
	@Test
	public void test208() {
		String hexCode = "277e0088";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 1b, rt: 1e, immediate(offset): 0088}", actualInstruction);
	}
	@Test
	public void test209() {
		String hexCode = "00ad1822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 05, rt: 0d, rd: 03, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test210() {
		String hexCode = "272300d4";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 19, rt: 03, immediate(offset): 00d4}", actualInstruction);
	}
	@Test
	public void test211() {
		String hexCode = "08000088";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 0000088}", actualInstruction);
	}
	@Test
	public void test212() {
		String hexCode = "006e7820";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 03, rt: 0e, rd: 0f, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test213() {
		String hexCode = "8f310000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 19, rt: 11, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test214() {
		String hexCode = "afbf0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 1d, rt: 1f, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test215() {
		String hexCode = "adec0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 0f, rt: 0c, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test216() {
		String hexCode = "8ca60058";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 05, rt: 06, immediate(offset): 0058}", actualInstruction);
	}
	@Test
	public void test217() {
		String hexCode = "017e4824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 0b, rt: 1e, rd: 09, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test218() {
		String hexCode = "0335c02a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 19, rt: 15, rd: 18, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test219() {
		String hexCode = "10700015";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 03, rt: 10, immediate(offset): 0015}", actualInstruction);
	}
	@Test
	public void test220() {
		String hexCode = "020ba020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 10, rt: 0b, rd: 14, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test221() {
		String hexCode = "3c1100a9";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 11, immediate(offset): 00a9}", actualInstruction);
	}
	@Test
	public void test222() {
		String hexCode = "08000078";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 0000078}", actualInstruction);
	}
	@Test
	public void test223() {
		String hexCode = "0083502a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 04, rt: 03, rd: 0a, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test224() {
		String hexCode = "00cda025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 06, rt: 0d, rd: 14, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test225() {
		String hexCode = "10c100b9";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 06, rt: 01, immediate(offset): 00b9}", actualInstruction);
	}
	@Test
	public void test226() {
		String hexCode = "12adff60";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 15, rt: 0d, immediate(offset): ff60}", actualInstruction);
	}
	@Test
	public void test227() {
		String hexCode = "8cb80000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 05, rt: 18, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test228() {
		String hexCode = "02800824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 14, rt: 00, rd: 01, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test229() {
		String hexCode = "ade50000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 0f, rt: 05, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test230() {
		String hexCode = "02c4d820";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 16, rt: 04, rd: 1b, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test231() {
		String hexCode = "0800007c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 000007c}", actualInstruction);
	}
	@Test
	public void test232() {
		String hexCode = "0111c820";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 08, rt: 11, rd: 19, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test233() {
		String hexCode = "3219ff29";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 10, rt: 19, immediate(offset): ff29}", actualInstruction);
	}
	@Test
	public void test234() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test235() {
		String hexCode = "31de002a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 0e, rt: 1e, immediate(offset): 002a}", actualInstruction);
	}
	@Test
	public void test236() {
		String hexCode = "ae9b0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 14, rt: 1b, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test237() {
		String hexCode = "02df6020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 16, rt: 1f, rd: 0c, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test238() {
		String hexCode = "3202ffa8";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 10, rt: 02, immediate(offset): ffa8}", actualInstruction);
	}
	@Test
	public void test239() {
		String hexCode = "010c0025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 08, rt: 0c, rd: 00, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test240() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test241() {
		String hexCode = "03e3b822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 1f, rt: 03, rd: 17, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test242() {
		String hexCode = "01071825";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 08, rt: 07, rd: 03, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test243() {
		String hexCode = "003e4820";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 01, rt: 1e, rd: 09, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test244() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test245() {
		String hexCode = "0031e022";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 01, rt: 11, rd: 1c, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test246() {
		String hexCode = "af7b0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 1b, rt: 1b, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test247() {
		String hexCode = "32a8ffba";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 15, rt: 08, immediate(offset): ffba}", actualInstruction);
	}
	@Test
	public void test248() {
		String hexCode = "3c1b0020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 1b, immediate(offset): 0020}", actualInstruction);
	}
	@Test
	public void test249() {
		String hexCode = "8f1f00f3";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 18, rt: 1f, immediate(offset): 00f3}", actualInstruction);
	}
	@Test
	public void test250() {
		String hexCode = "3c07009c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 07, immediate(offset): 009c}", actualInstruction);
	}
	@Test
	public void test251() {
		String hexCode = "02eb0025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 17, rt: 0b, rd: 00, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test252() {
		String hexCode = "13feff3a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 1f, rt: 1e, immediate(offset): ff3a}", actualInstruction);
	}
	@Test
	public void test253() {
		String hexCode = "018df024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 0c, rt: 0d, rd: 1e, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test254() {
		String hexCode = "023ed02a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 11, rt: 1e, rd: 1a, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test255() {
		String hexCode = "ac810000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 04, rt: 01, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test256() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test257() {
		String hexCode = "3c1f00e3";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 1f, immediate(offset): 00e3}", actualInstruction);
	}
	@Test
	public void test258() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test259() {
		String hexCode = "1217ff64";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 10, rt: 17, immediate(offset): ff64}", actualInstruction);
	}
	@Test
	public void test260() {
		String hexCode = "1517ff00";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 08, rt: 17, immediate(offset): ff00}", actualInstruction);
	}
	@Test
	public void test261() {
		String hexCode = "36a8ffb1";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 15, rt: 08, immediate(offset): ffb1}", actualInstruction);
	}
	@Test
	public void test262() {
		String hexCode = "08000059";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 0000059}", actualInstruction);
	}
	@Test
	public void test263() {
		String hexCode = "00761822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 03, rt: 16, rd: 03, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test264() {
		String hexCode = "00fc602a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 07, rt: 1c, rd: 0c, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test265() {
		String hexCode = "8f6a0090";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 1b, rt: 0a, immediate(offset): 0090}", actualInstruction);
	}
	@Test
	public void test266() {
		String hexCode = "12dc00ac";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 16, rt: 1c, immediate(offset): 00ac}", actualInstruction);
	}
	@Test
	public void test267() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test268() {
		String hexCode = "ac4d0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 02, rt: 0d, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test269() {
		String hexCode = "3c1d0005";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 1d, immediate(offset): 0005}", actualInstruction);
	}
	@Test
	public void test270() {
		String hexCode = "00a22820";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 05, rt: 02, rd: 05, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test271() {
		String hexCode = "1585ff6c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 0c, rt: 05, immediate(offset): ff6c}", actualInstruction);
	}
	@Test
	public void test272() {
		String hexCode = "34c600b7";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 06, rt: 06, immediate(offset): 00b7}", actualInstruction);
	}
	@Test
	public void test273() {
		String hexCode = "01bd882a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 0d, rt: 1d, rd: 11, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test274() {
		String hexCode = "307cffca";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 03, rt: 1c, immediate(offset): ffca}", actualInstruction);
	}
	@Test
	public void test275() {
		String hexCode = "080000be";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 00000be}", actualInstruction);
	}
	@Test
	public void test276() {
		String hexCode = "ac220000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 01, rt: 02, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test277() {
		String hexCode = "080000c7";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 00000c7}", actualInstruction);
	}
	@Test
	public void test278() {
		String hexCode = "17f7ffca";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 1f, rt: 17, immediate(offset): ffca}", actualInstruction);
	}
	@Test
	public void test279() {
		String hexCode = "0062f824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 03, rt: 02, rd: 1f, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test280() {
		String hexCode = "00de0824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 06, rt: 1e, rd: 01, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test281() {
		String hexCode = "03aad020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 1d, rt: 0a, rd: 1a, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test282() {
		String hexCode = "02044822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 10, rt: 04, rd: 09, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test283() {
		String hexCode = "023e0820";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 11, rt: 1e, rd: 01, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test284() {
		String hexCode = "30d80031";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 06, rt: 18, immediate(offset): 0031}", actualInstruction);
	}
	@Test
	public void test285() {
		String hexCode = "1482ff3f";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 04, rt: 02, immediate(offset): ff3f}", actualInstruction);
	}
	@Test
	public void test286() {
		String hexCode = "022dd824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 11, rt: 0d, rd: 1b, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test287() {
		String hexCode = "accf0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 06, rt: 0f, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test288() {
		String hexCode = "356400c4";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 0b, rt: 04, immediate(offset): 00c4}", actualInstruction);
	}
	@Test
	public void test289() {
		String hexCode = "178c00bb";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 1c, rt: 0c, immediate(offset): 00bb}", actualInstruction);
	}
	@Test
	public void test290() {
		String hexCode = "317800d0";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 0b, rt: 18, immediate(offset): 00d0}", actualInstruction);
	}
	@Test
	public void test291() {
		String hexCode = "15040040";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 08, rt: 04, immediate(offset): 0040}", actualInstruction);
	}
	@Test
	public void test292() {
		String hexCode = "8cd10000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 06, rt: 11, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test293() {
		String hexCode = "3c160078";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 16, immediate(offset): 0078}", actualInstruction);
	}
	@Test
	public void test294() {
		String hexCode = "03b0482a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 1d, rt: 10, rd: 09, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test295() {
		String hexCode = "273a001b";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 19, rt: 1a, immediate(offset): 001b}", actualInstruction);
	}
	@Test
	public void test296() {
		String hexCode = "8e9b0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 14, rt: 1b, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test297() {
		String hexCode = "14cb0001";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 06, rt: 0b, immediate(offset): 0001}", actualInstruction);
	}
	@Test
	public void test298() {
		String hexCode = "3598fff7";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 0c, rt: 18, immediate(offset): fff7}", actualInstruction);
	}
	@Test
	public void test299() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test300() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test301() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test302() {
		String hexCode = "01e59820";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 0f, rt: 05, rd: 13, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test303() {
		String hexCode = "0397c824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 1c, rt: 17, rd: 19, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test304() {
		String hexCode = "01aa2822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 0d, rt: 0a, rd: 05, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test305() {
		String hexCode = "26e60029";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 17, rt: 06, immediate(offset): 0029}", actualInstruction);
	}
	@Test
	public void test306() {
		String hexCode = "37a0ff2d";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 1d, rt: 00, immediate(offset): ff2d}", actualInstruction);
	}
	@Test
	public void test307() {
		String hexCode = "11c2001f";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 0e, rt: 02, immediate(offset): 001f}", actualInstruction);
	}
	@Test
	public void test308() {
		String hexCode = "25be0019";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 0d, rt: 1e, immediate(offset): 0019}", actualInstruction);
	}
	@Test
	public void test309() {
		String hexCode = "af200000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 19, rt: 00, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test310() {
		String hexCode = "00a20824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 05, rt: 02, rd: 01, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test311() {
		String hexCode = "267300b9";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 13, rt: 13, immediate(offset): 00b9}", actualInstruction);
	}
	@Test
	public void test312() {
		String hexCode = "acb30018";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 05, rt: 13, immediate(offset): 0018}", actualInstruction);
	}
	@Test
	public void test313() {
		String hexCode = "356f0026";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 0b, rt: 0f, immediate(offset): 0026}", actualInstruction);
	}
	@Test
	public void test314() {
		String hexCode = "1130006d";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 09, rt: 10, immediate(offset): 006d}", actualInstruction);
	}
	@Test
	public void test315() {
		String hexCode = "3321ff82";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 19, rt: 01, immediate(offset): ff82}", actualInstruction);
	}
	@Test
	public void test316() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test317() {
		String hexCode = "013f8024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 09, rt: 1f, rd: 10, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test318() {
		String hexCode = "1025002b";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 01, rt: 05, immediate(offset): 002b}", actualInstruction);
	}
	@Test
	public void test319() {
		String hexCode = "0351f822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 1a, rt: 11, rd: 1f, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test320() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test321() {
		String hexCode = "00148020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 00, rt: 14, rd: 10, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test322() {
		String hexCode = "03371824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 19, rt: 17, rd: 03, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test323() {
		String hexCode = "347dff6e";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 03, rt: 1d, immediate(offset): ff6e}", actualInstruction);
	}
	@Test
	public void test324() {
		String hexCode = "167300cf";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 13, rt: 13, immediate(offset): 00cf}", actualInstruction);
	}
	@Test
	public void test325() {
		String hexCode = "02d0c02a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 16, rt: 10, rd: 18, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test326() {
		String hexCode = "370affc5";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 18, rt: 0a, immediate(offset): ffc5}", actualInstruction);
	}
	@Test
	public void test327() {
		String hexCode = "31b1ff39";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 0d, rt: 11, immediate(offset): ff39}", actualInstruction);
	}
	@Test
	public void test328() {
		String hexCode = "00fe382a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 07, rt: 1e, rd: 07, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test329() {
		String hexCode = "3110fffb";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 08, rt: 10, immediate(offset): fffb}", actualInstruction);
	}
	@Test
	public void test330() {
		String hexCode = "3c130095";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 13, immediate(offset): 0095}", actualInstruction);
	}
	@Test
	public void test331() {
		String hexCode = "03696824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 1b, rt: 09, rd: 0d, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test332() {
		String hexCode = "01b35822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 0d, rt: 13, rd: 0b, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test333() {
		String hexCode = "8cd3ff5b";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 06, rt: 13, immediate(offset): ff5b}", actualInstruction);
	}
	@Test
	public void test334() {
		String hexCode = "02fa9824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 17, rt: 1a, rd: 13, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test335() {
		String hexCode = "02ad502a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 15, rt: 0d, rd: 0a, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test336() {
		String hexCode = "131a00e4";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 18, rt: 1a, immediate(offset): 00e4}", actualInstruction);
	}
	@Test
	public void test337() {
		String hexCode = "00ac1822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 05, rt: 0c, rd: 03, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test338() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test339() {
		String hexCode = "16ec0089";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 17, rt: 0c, immediate(offset): 0089}", actualInstruction);
	}
	@Test
	public void test340() {
		String hexCode = "3c1c0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 1c, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test341() {
		String hexCode = "010ea822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 08, rt: 0e, rd: 15, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test342() {
		String hexCode = "31cc0024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 0e, rt: 0c, immediate(offset): 0024}", actualInstruction);
	}
	@Test
	public void test343() {
		String hexCode = "3172ff4c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 0b, rt: 12, immediate(offset): ff4c}", actualInstruction);
	}
	@Test
	public void test344() {
		String hexCode = "0800008f";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 000008f}", actualInstruction);
	}
	@Test
	public void test345() {
		String hexCode = "002b3022";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 01, rt: 0b, rd: 06, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test346() {
		String hexCode = "02d1e02a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 16, rt: 11, rd: 1c, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test347() {
		String hexCode = "8dadff45";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 0d, rt: 0d, immediate(offset): ff45}", actualInstruction);
	}
	@Test
	public void test348() {
		String hexCode = "361a00a1";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 10, rt: 1a, immediate(offset): 00a1}", actualInstruction);
	}
	@Test
	public void test349() {
		String hexCode = "35200006";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 09, rt: 00, immediate(offset): 0006}", actualInstruction);
	}
	@Test
	public void test350() {
		String hexCode = "3c1400e6";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 14, immediate(offset): 00e6}", actualInstruction);
	}
	@Test
	public void test351() {
		String hexCode = "01829824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 0c, rt: 02, rd: 13, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test352() {
		String hexCode = "165aff05";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 12, rt: 1a, immediate(offset): ff05}", actualInstruction);
	}
	@Test
	public void test353() {
		String hexCode = "0179f820";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 0b, rt: 19, rd: 1f, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test354() {
		String hexCode = "0800000f";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 000000f}", actualInstruction);
	}
	@Test
	public void test355() {
		String hexCode = "03a59822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 1d, rt: 05, rd: 13, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test356() {
		String hexCode = "00ac182a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 05, rt: 0c, rd: 03, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test357() {
		String hexCode = "3217ff0d";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 10, rt: 17, immediate(offset): ff0d}", actualInstruction);
	}
	@Test
	public void test358() {
		String hexCode = "af170089";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 18, rt: 17, immediate(offset): 0089}", actualInstruction);
	}
	@Test
	public void test359() {
		String hexCode = "012c4025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 09, rt: 0c, rd: 08, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test360() {
		String hexCode = "008f2024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 04, rt: 0f, rd: 04, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test361() {
		String hexCode = "03fbb020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 1f, rt: 1b, rd: 16, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test362() {
		String hexCode = "001e4020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 00, rt: 1e, rd: 08, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test363() {
		String hexCode = "01b4e020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 0d, rt: 14, rd: 1c, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test364() {
		String hexCode = "080000ef";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 00000ef}", actualInstruction);
	}
	@Test
	public void test365() {
		String hexCode = "00fa5820";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 07, rt: 1a, rd: 0b, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test366() {
		String hexCode = "00257822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 01, rt: 05, rd: 0f, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test367() {
		String hexCode = "3c0e00a8";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 0e, immediate(offset): 00a8}", actualInstruction);
	}
	@Test
	public void test368() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test369() {
		String hexCode = "249300dc";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 04, rt: 13, immediate(offset): 00dc}", actualInstruction);
	}
	@Test
	public void test370() {
		String hexCode = "258b0020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 0c, rt: 0b, immediate(offset): 0020}", actualInstruction);
	}
	@Test
	public void test371() {
		String hexCode = "3071ff2f";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 03, rt: 11, immediate(offset): ff2f}", actualInstruction);
	}
	@Test
	public void test372() {
		String hexCode = "0065e02a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 03, rt: 05, rd: 1c, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test373() {
		String hexCode = "009b5820";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 04, rt: 1b, rd: 0b, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test374() {
		String hexCode = "08000049";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 0000049}", actualInstruction);
	}
	@Test
	public void test375() {
		String hexCode = "109fff47";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 04, rt: 1f, immediate(offset): ff47}", actualInstruction);
	}
	@Test
	public void test376() {
		String hexCode = "8fa40000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 1d, rt: 04, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test377() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test378() {
		String hexCode = "0800003a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 000003a}", actualInstruction);
	}
	@Test
	public void test379() {
		String hexCode = "0258c024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 12, rt: 18, rd: 18, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test380() {
		String hexCode = "ae2b0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 11, rt: 0b, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test381() {
		String hexCode = "02c0b025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 16, rt: 00, rd: 16, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test382() {
		String hexCode = "339bff1b";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 1c, rt: 1b, immediate(offset): ff1b}", actualInstruction);
	}
	@Test
	public void test383() {
		String hexCode = "08000070";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 0000070}", actualInstruction);
	}
	@Test
	public void test384() {
		String hexCode = "01859022";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 0c, rt: 05, rd: 12, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test385() {
		String hexCode = "aff70000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 1f, rt: 17, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test386() {
		String hexCode = "33a100ff";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 1d, rt: 01, immediate(offset): 00ff}", actualInstruction);
	}
	@Test
	public void test387() {
		String hexCode = "afb6ff92";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 1d, rt: 16, immediate(offset): ff92}", actualInstruction);
	}
	@Test
	public void test388() {
		String hexCode = "304b0072";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 02, rt: 0b, immediate(offset): 0072}", actualInstruction);
	}
	@Test
	public void test389() {
		String hexCode = "01e7282a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 0f, rt: 07, rd: 05, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test390() {
		String hexCode = "aff1009e";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 1f, rt: 11, immediate(offset): 009e}", actualInstruction);
	}
	@Test
	public void test391() {
		String hexCode = "0039a82a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 01, rt: 19, rd: 15, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test392() {
		String hexCode = "038b6822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 1c, rt: 0b, rd: 0d, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test393() {
		String hexCode = "01d29022";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 0e, rt: 12, rd: 12, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test394() {
		String hexCode = "0376f824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 1b, rt: 16, rd: 1f, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test395() {
		String hexCode = "14c900b2";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 06, rt: 09, immediate(offset): 00b2}", actualInstruction);
	}
	@Test
	public void test396() {
		String hexCode = "15860032";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 0c, rt: 06, immediate(offset): 0032}", actualInstruction);
	}
	@Test
	public void test397() {
		String hexCode = "01847824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 0c, rt: 04, rd: 0f, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test398() {
		String hexCode = "002d6820";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 01, rt: 0d, rd: 0d, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test399() {
		String hexCode = "152b0048";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 09, rt: 0b, immediate(offset): 0048}", actualInstruction);
	}
	@Test
	public void test400() {
		String hexCode = "ad5100fa";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 0a, rt: 11, immediate(offset): 00fa}", actualInstruction);
	}
	@Test
	public void test401() {
		String hexCode = "3c1c0093";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 1c, immediate(offset): 0093}", actualInstruction);
	}
	@Test
	public void test402() {
		String hexCode = "00e46024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 07, rt: 04, rd: 0c, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test403() {
		String hexCode = "143000bb";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 01, rt: 10, immediate(offset): 00bb}", actualInstruction);
	}
	@Test
	public void test404() {
		String hexCode = "025e502a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 12, rt: 1e, rd: 0a, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test405() {
		String hexCode = "8e080000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 10, rt: 08, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test406() {
		String hexCode = "01009820";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 08, rt: 00, rd: 13, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test407() {
		String hexCode = "af7f0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 1b, rt: 1f, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test408() {
		String hexCode = "135b002a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 1a, rt: 1b, immediate(offset): 002a}", actualInstruction);
	}
	@Test
	public void test409() {
		String hexCode = "24610047";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 03, rt: 01, immediate(offset): 0047}", actualInstruction);
	}
	@Test
	public void test410() {
		String hexCode = "0800006f";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 000006f}", actualInstruction);
	}
	@Test
	public void test411() {
		String hexCode = "03cd8022";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 1e, rt: 0d, rd: 10, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test412() {
		String hexCode = "266d00ac";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 13, rt: 0d, immediate(offset): 00ac}", actualInstruction);
	}
	@Test
	public void test413() {
		String hexCode = "340eff39";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 00, rt: 0e, immediate(offset): ff39}", actualInstruction);
	}
	@Test
	public void test414() {
		String hexCode = "10f300c5";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 07, rt: 13, immediate(offset): 00c5}", actualInstruction);
	}
	@Test
	public void test415() {
		String hexCode = "24910095";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 04, rt: 11, immediate(offset): 0095}", actualInstruction);
	}
	@Test
	public void test416() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test417() {
		String hexCode = "3160ffe4";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 0b, rt: 00, immediate(offset): ffe4}", actualInstruction);
	}
	@Test
	public void test418() {
		String hexCode = "263600f7";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 11, rt: 16, immediate(offset): 00f7}", actualInstruction);
	}
	@Test
	public void test419() {
		String hexCode = "00856825";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 04, rt: 05, rd: 0d, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test420() {
		String hexCode = "13cfffbd";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 1e, rt: 0f, immediate(offset): ffbd}", actualInstruction);
	}
	@Test
	public void test421() {
		String hexCode = "3c1c0031";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 1c, immediate(offset): 0031}", actualInstruction);
	}
	@Test
	public void test422() {
		String hexCode = "3c0c0004";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 0c, immediate(offset): 0004}", actualInstruction);
	}
	@Test
	public void test423() {
		String hexCode = "322200d7";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 11, rt: 02, immediate(offset): 00d7}", actualInstruction);
	}
	@Test
	public void test424() {
		String hexCode = "327600a2";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 13, rt: 16, immediate(offset): 00a2}", actualInstruction);
	}
	@Test
	public void test425() {
		String hexCode = "8e770000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 13, rt: 17, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test426() {
		String hexCode = "8fa600f8";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 1d, rt: 06, immediate(offset): 00f8}", actualInstruction);
	}
	@Test
	public void test427() {
		String hexCode = "ae840000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 14, rt: 04, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test428() {
		String hexCode = "02d8e020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 16, rt: 18, rd: 1c, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test429() {
		String hexCode = "32e8ffca";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 17, rt: 08, immediate(offset): ffca}", actualInstruction);
	}
	@Test
	public void test430() {
		String hexCode = "3266ff6b";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 13, rt: 06, immediate(offset): ff6b}", actualInstruction);
	}
	@Test
	public void test431() {
		String hexCode = "01f28020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 0f, rt: 12, rd: 10, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test432() {
		String hexCode = "00e14020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 07, rt: 01, rd: 08, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test433() {
		String hexCode = "103cff29";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 01, rt: 1c, immediate(offset): ff29}", actualInstruction);
	}
	@Test
	public void test434() {
		String hexCode = "080000f7";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 00000f7}", actualInstruction);
	}
	@Test
	public void test435() {
		String hexCode = "1510005c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 08, rt: 10, immediate(offset): 005c}", actualInstruction);
	}
	@Test
	public void test436() {
		String hexCode = "32f0ff75";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 17, rt: 10, immediate(offset): ff75}", actualInstruction);
	}
	@Test
	public void test437() {
		String hexCode = "0282a025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 14, rt: 02, rd: 14, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test438() {
		String hexCode = "1175ffbd";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 0b, rt: 15, immediate(offset): ffbd}", actualInstruction);
	}
	@Test
	public void test439() {
		String hexCode = "37ec0064";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 1f, rt: 0c, immediate(offset): 0064}", actualInstruction);
	}
	@Test
	public void test440() {
		String hexCode = "3c090051";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 09, immediate(offset): 0051}", actualInstruction);
	}
	@Test
	public void test441() {
		String hexCode = "adac0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 0d, rt: 0c, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test442() {
		String hexCode = "35230093";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 09, rt: 03, immediate(offset): 0093}", actualInstruction);
	}
	@Test
	public void test443() {
		String hexCode = "0023c825";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 01, rt: 03, rd: 19, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test444() {
		String hexCode = "130bffe0";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 18, rt: 0b, immediate(offset): ffe0}", actualInstruction);
	}
	@Test
	public void test445() {
		String hexCode = "0383c822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 1c, rt: 03, rd: 19, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test446() {
		String hexCode = "352b0048";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 09, rt: 0b, immediate(offset): 0048}", actualInstruction);
	}
	@Test
	public void test447() {
		String hexCode = "3c0e00d7";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 0e, immediate(offset): 00d7}", actualInstruction);
	}
	@Test
	public void test448() {
		String hexCode = "ae720000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 13, rt: 12, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test449() {
		String hexCode = "0800000b";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 000000b}", actualInstruction);
	}
	@Test
	public void test450() {
		String hexCode = "2786009a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 1c, rt: 06, immediate(offset): 009a}", actualInstruction);
	}
	@Test
	public void test451() {
		String hexCode = "372f0006";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 19, rt: 0f, immediate(offset): 0006}", actualInstruction);
	}
	@Test
	public void test452() {
		String hexCode = "08000050";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 0000050}", actualInstruction);
	}
	@Test
	public void test453() {
		String hexCode = "3208004b";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 10, rt: 08, immediate(offset): 004b}", actualInstruction);
	}
	@Test
	public void test454() {
		String hexCode = "03596020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 1a, rt: 19, rd: 0c, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test455() {
		String hexCode = "002a8025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 01, rt: 0a, rd: 10, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test456() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test457() {
		String hexCode = "0008e82a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 00, rt: 08, rd: 1d, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test458() {
		String hexCode = "036f3025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 1b, rt: 0f, rd: 06, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test459() {
		String hexCode = "8cfc0037";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 07, rt: 1c, immediate(offset): 0037}", actualInstruction);
	}
	@Test
	public void test460() {
		String hexCode = "0017b820";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 00, rt: 17, rd: 17, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test461() {
		String hexCode = "24ab00cc";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 05, rt: 0b, immediate(offset): 00cc}", actualInstruction);
	}
	@Test
	public void test462() {
		String hexCode = "10d40037";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 06, rt: 14, immediate(offset): 0037}", actualInstruction);
	}
	@Test
	public void test463() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test464() {
		String hexCode = "02ff9825";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 17, rt: 1f, rd: 13, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test465() {
		String hexCode = "12bcffcc";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 15, rt: 1c, immediate(offset): ffcc}", actualInstruction);
	}
	@Test
	public void test466() {
		String hexCode = "8c0b0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 00, rt: 0b, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test467() {
		String hexCode = "0800002e";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 000002e}", actualInstruction);
	}
	@Test
	public void test468() {
		String hexCode = "019d5825";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 0c, rt: 1d, rd: 0b, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test469() {
		String hexCode = "25de0088";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 0e, rt: 1e, immediate(offset): 0088}", actualInstruction);
	}
	@Test
	public void test470() {
		String hexCode = "0262402a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 13, rt: 02, rd: 08, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test471() {
		String hexCode = "325cff89";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 12, rt: 1c, immediate(offset): ff89}", actualInstruction);
	}
	@Test
	public void test472() {
		String hexCode = "00016024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 00, rt: 01, rd: 0c, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test473() {
		String hexCode = "3c0b0024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 0b, immediate(offset): 0024}", actualInstruction);
	}
	@Test
	public void test474() {
		String hexCode = "2414004e";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 00, rt: 14, immediate(offset): 004e}", actualInstruction);
	}
	@Test
	public void test475() {
		String hexCode = "154900ce";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 0a, rt: 09, immediate(offset): 00ce}", actualInstruction);
	}
	@Test
	public void test476() {
		String hexCode = "8f710000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 1b, rt: 11, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test477() {
		String hexCode = "3483ffc0";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 04, rt: 03, immediate(offset): ffc0}", actualInstruction);
	}
	@Test
	public void test478() {
		String hexCode = "8f300000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 19, rt: 10, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test479() {
		String hexCode = "24ae00d4";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 05, rt: 0e, immediate(offset): 00d4}", actualInstruction);
	}
	@Test
	public void test480() {
		String hexCode = "1013ff4c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 00, rt: 13, immediate(offset): ff4c}", actualInstruction);
	}
	@Test
	public void test481() {
		String hexCode = "37d9ffc3";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 1e, rt: 19, immediate(offset): ffc3}", actualInstruction);
	}
	@Test
	public void test482() {
		String hexCode = "002b382a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 01, rt: 0b, rd: 07, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test483() {
		String hexCode = "8d100000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 08, rt: 10, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test484() {
		String hexCode = "08000024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 0000024}", actualInstruction);
	}
	@Test
	public void test485() {
		String hexCode = "148affd4";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 04, rt: 0a, immediate(offset): ffd4}", actualInstruction);
	}
	@Test
	public void test486() {
		String hexCode = "08000019";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 0000019}", actualInstruction);
	}
	@Test
	public void test487() {
		String hexCode = "08000039";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 0000039}", actualInstruction);
	}
	@Test
	public void test488() {
		String hexCode = "03a8d022";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 1d, rt: 08, rd: 1a, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test489() {
		String hexCode = "13b50024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 1d, rt: 15, immediate(offset): 0024}", actualInstruction);
	}
	@Test
	public void test490() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test491() {
		String hexCode = "03d5e025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 1e, rt: 15, rd: 1c, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test492() {
		String hexCode = "3c1f0095";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 1f, immediate(offset): 0095}", actualInstruction);
	}
	@Test
	public void test493() {
		String hexCode = "ac7f0095";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 03, rt: 1f, immediate(offset): 0095}", actualInstruction);
	}
	@Test
	public void test494() {
		String hexCode = "27d300a7";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 1e, rt: 13, immediate(offset): 00a7}", actualInstruction);
	}
	@Test
	public void test495() {
		String hexCode = "080000e2";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 00000e2}", actualInstruction);
	}
	@Test
	public void test496() {
		String hexCode = "ac9f001b";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 04, rt: 1f, immediate(offset): 001b}", actualInstruction);
	}
	@Test
	public void test497() {
		String hexCode = "10a0ff0a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 05, rt: 00, immediate(offset): ff0a}", actualInstruction);
	}
	@Test
	public void test498() {
		String hexCode = "0800004f";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 000004f}", actualInstruction);
	}
	@Test
	public void test499() {
		String hexCode = "3029fff1";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 01, rt: 09, immediate(offset): fff1}", actualInstruction);
	}
	@Test
	public void test500() {
		String hexCode = "02d89825";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 16, rt: 18, rd: 13, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test501() {
		String hexCode = "10c6ffbf";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 06, rt: 06, immediate(offset): ffbf}", actualInstruction);
	}
	@Test
	public void test502() {
		String hexCode = "8d250000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 09, rt: 05, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test503() {
		String hexCode = "adc40000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 0e, rt: 04, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test504() {
		String hexCode = "080000a8";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 00000a8}", actualInstruction);
	}
	@Test
	public void test505() {
		String hexCode = "026a3824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 13, rt: 0a, rd: 07, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test506() {
		String hexCode = "01408024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 0a, rt: 00, rd: 10, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test507() {
		String hexCode = "3c130067";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 13, immediate(offset): 0067}", actualInstruction);
	}
	@Test
	public void test508() {
		String hexCode = "026e3024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 13, rt: 0e, rd: 06, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test509() {
		String hexCode = "005d1025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 02, rt: 1d, rd: 02, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test510() {
		String hexCode = "ac620000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 03, rt: 02, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test511() {
		String hexCode = "02a29822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 15, rt: 02, rd: 13, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test512() {
		String hexCode = "1752ffdc";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 1a, rt: 12, immediate(offset): ffdc}", actualInstruction);
	}
	@Test
	public void test513() {
		String hexCode = "080000e4";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 00000e4}", actualInstruction);
	}
	@Test
	public void test514() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test515() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test516() {
		String hexCode = "3738ffd0";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 19, rt: 18, immediate(offset): ffd0}", actualInstruction);
	}
	@Test
	public void test517() {
		String hexCode = "0154b025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 0a, rt: 14, rd: 16, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test518() {
		String hexCode = "3c0b001f";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 0b, immediate(offset): 001f}", actualInstruction);
	}
	@Test
	public void test519() {
		String hexCode = "af1100cb";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 18, rt: 11, immediate(offset): 00cb}", actualInstruction);
	}
	@Test
	public void test520() {
		String hexCode = "329c0035";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 14, rt: 1c, immediate(offset): 0035}", actualInstruction);
	}
	@Test
	public void test521() {
		String hexCode = "031b182a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 18, rt: 1b, rd: 03, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test522() {
		String hexCode = "8c5f0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 02, rt: 1f, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test523() {
		String hexCode = "33b7ff98";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 1d, rt: 17, immediate(offset): ff98}", actualInstruction);
	}
	@Test
	public void test524() {
		String hexCode = "3c0e0081";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 0e, immediate(offset): 0081}", actualInstruction);
	}
	@Test
	public void test525() {
		String hexCode = "371e002f";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 18, rt: 1e, immediate(offset): 002f}", actualInstruction);
	}
	@Test
	public void test526() {
		String hexCode = "3285ffbf";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 14, rt: 05, immediate(offset): ffbf}", actualInstruction);
	}
	@Test
	public void test527() {
		String hexCode = "339affb8";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 1c, rt: 1a, immediate(offset): ffb8}", actualInstruction);
	}
	@Test
	public void test528() {
		String hexCode = "0800004d";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 000004d}", actualInstruction);
	}
	@Test
	public void test529() {
		String hexCode = "00b2b022";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 05, rt: 12, rd: 16, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test530() {
		String hexCode = "3218ffa3";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 10, rt: 18, immediate(offset): ffa3}", actualInstruction);
	}
	@Test
	public void test531() {
		String hexCode = "14d700b3";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 06, rt: 17, immediate(offset): 00b3}", actualInstruction);
	}
	@Test
	public void test532() {
		String hexCode = "13bcfffd";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 1d, rt: 1c, immediate(offset): fffd}", actualInstruction);
	}
	@Test
	public void test533() {
		String hexCode = "37b900dd";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 1d, rt: 19, immediate(offset): 00dd}", actualInstruction);
	}
	@Test
	public void test534() {
		String hexCode = "00d5402a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 06, rt: 15, rd: 08, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test535() {
		String hexCode = "256f00aa";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 0b, rt: 0f, immediate(offset): 00aa}", actualInstruction);
	}
	@Test
	public void test536() {
		String hexCode = "25410067";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 0a, rt: 01, immediate(offset): 0067}", actualInstruction);
	}
	@Test
	public void test537() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test538() {
		String hexCode = "347400da";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 03, rt: 14, immediate(offset): 00da}", actualInstruction);
	}
	@Test
	public void test539() {
		String hexCode = "147f00f7";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 03, rt: 1f, immediate(offset): 00f7}", actualInstruction);
	}
	@Test
	public void test540() {
		String hexCode = "1348ff5e";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 1a, rt: 08, immediate(offset): ff5e}", actualInstruction);
	}
	@Test
	public void test541() {
		String hexCode = "8d200000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 09, rt: 00, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test542() {
		String hexCode = "02723825";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 13, rt: 12, rd: 07, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test543() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test544() {
		String hexCode = "02dce825";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 16, rt: 1c, rd: 1d, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test545() {
		String hexCode = "0146682a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 0a, rt: 06, rd: 0d, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test546() {
		String hexCode = "08000060";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 0000060}", actualInstruction);
	}
	@Test
	public void test547() {
		String hexCode = "080000dd";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 00000dd}", actualInstruction);
	}
	@Test
	public void test548() {
		String hexCode = "321eff28";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 10, rt: 1e, immediate(offset): ff28}", actualInstruction);
	}
	@Test
	public void test549() {
		String hexCode = "0129802a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 09, rt: 09, rd: 10, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test550() {
		String hexCode = "12a600ee";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 15, rt: 06, immediate(offset): 00ee}", actualInstruction);
	}
	@Test
	public void test551() {
		String hexCode = "02756820";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 13, rt: 15, rd: 0d, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test552() {
		String hexCode = "8cf80000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 07, rt: 18, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test553() {
		String hexCode = "25470080";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 0a, rt: 07, immediate(offset): 0080}", actualInstruction);
	}
	@Test
	public void test554() {
		String hexCode = "338600bb";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 1c, rt: 06, immediate(offset): 00bb}", actualInstruction);
	}
	@Test
	public void test555() {
		String hexCode = "3c1a00f2";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 1a, immediate(offset): 00f2}", actualInstruction);
	}
	@Test
	public void test556() {
		String hexCode = "3c0c0063";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 0c, immediate(offset): 0063}", actualInstruction);
	}
	@Test
	public void test557() {
		String hexCode = "03a3202a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 1d, rt: 03, rd: 04, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test558() {
		String hexCode = "8f37ffe2";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 19, rt: 17, immediate(offset): ffe2}", actualInstruction);
	}
	@Test
	public void test559() {
		String hexCode = "0800003c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 000003c}", actualInstruction);
	}
	@Test
	public void test560() {
		String hexCode = "102000dd";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 01, rt: 00, immediate(offset): 00dd}", actualInstruction);
	}
	@Test
	public void test561() {
		String hexCode = "30b3ffcf";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 05, rt: 13, immediate(offset): ffcf}", actualInstruction);
	}
	@Test
	public void test562() {
		String hexCode = "03d68825";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 1e, rt: 16, rd: 11, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test563() {
		String hexCode = "3c1100fb";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 11, immediate(offset): 00fb}", actualInstruction);
	}
	@Test
	public void test564() {
		String hexCode = "03317825";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 19, rt: 11, rd: 0f, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test565() {
		String hexCode = "080000a4";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 00000a4}", actualInstruction);
	}
	@Test
	public void test566() {
		String hexCode = "08000044";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 0000044}", actualInstruction);
	}
	@Test
	public void test567() {
		String hexCode = "080000e0";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 00000e0}", actualInstruction);
	}
	@Test
	public void test568() {
		String hexCode = "3c03006e";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 03, immediate(offset): 006e}", actualInstruction);
	}
	@Test
	public void test569() {
		String hexCode = "25ef00ce";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 0f, rt: 0f, immediate(offset): 00ce}", actualInstruction);
	}
	@Test
	public void test570() {
		String hexCode = "3c1300ac";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 13, immediate(offset): 00ac}", actualInstruction);
	}
	@Test
	public void test571() {
		String hexCode = "3c1100d3";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 11, immediate(offset): 00d3}", actualInstruction);
	}
	@Test
	public void test572() {
		String hexCode = "16dfff2c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 16, rt: 1f, immediate(offset): ff2c}", actualInstruction);
	}
	@Test
	public void test573() {
		String hexCode = "018ec02a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 0c, rt: 0e, rd: 18, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test574() {
		String hexCode = "142600b1";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 01, rt: 06, immediate(offset): 00b1}", actualInstruction);
	}
	@Test
	public void test575() {
		String hexCode = "133a0076";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 19, rt: 1a, immediate(offset): 0076}", actualInstruction);
	}
	@Test
	public void test576() {
		String hexCode = "ae0f0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 10, rt: 0f, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test577() {
		String hexCode = "371d00ca";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 18, rt: 1d, immediate(offset): 00ca}", actualInstruction);
	}
	@Test
	public void test578() {
		String hexCode = "02f57020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 17, rt: 15, rd: 0e, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test579() {
		String hexCode = "02e8a02a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 17, rt: 08, rd: 14, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test580() {
		String hexCode = "0095d020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 04, rt: 15, rd: 1a, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test581() {
		String hexCode = "10c90082";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 06, rt: 09, immediate(offset): 0082}", actualInstruction);
	}
	@Test
	public void test582() {
		String hexCode = "0257f02a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 12, rt: 17, rd: 1e, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test583() {
		String hexCode = "00a1a024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 05, rt: 01, rd: 14, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test584() {
		String hexCode = "02db502a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 16, rt: 1b, rd: 0a, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test585() {
		String hexCode = "080000a6";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 00000a6}", actualInstruction);
	}
	@Test
	public void test586() {
		String hexCode = "00489022";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 02, rt: 08, rd: 12, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test587() {
		String hexCode = "31e5ff68";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 0f, rt: 05, immediate(offset): ff68}", actualInstruction);
	}
	@Test
	public void test588() {
		String hexCode = "146b00b0";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 03, rt: 0b, immediate(offset): 00b0}", actualInstruction);
	}
	@Test
	public void test589() {
		String hexCode = "34d2009b";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 06, rt: 12, immediate(offset): 009b}", actualInstruction);
	}
	@Test
	public void test590() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test591() {
		String hexCode = "176600cf";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 1b, rt: 06, immediate(offset): 00cf}", actualInstruction);
	}
	@Test
	public void test592() {
		String hexCode = "01691024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 0b, rt: 09, rd: 02, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test593() {
		String hexCode = "0145f822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 0a, rt: 05, rd: 1f, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test594() {
		String hexCode = "16ce0033";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 16, rt: 0e, immediate(offset): 0033}", actualInstruction);
	}
	@Test
	public void test595() {
		String hexCode = "8d970000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 0c, rt: 17, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test596() {
		String hexCode = "25020088";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 08, rt: 02, immediate(offset): 0088}", actualInstruction);
	}
	@Test
	public void test597() {
		String hexCode = "00959025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 04, rt: 15, rd: 12, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test598() {
		String hexCode = "1340ff0a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 1a, rt: 00, immediate(offset): ff0a}", actualInstruction);
	}
	@Test
	public void test599() {
		String hexCode = "accb0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 06, rt: 0b, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test600() {
		String hexCode = "00168020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 00, rt: 16, rd: 10, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test601() {
		String hexCode = "8df60000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 0f, rt: 16, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test602() {
		String hexCode = "35fd0007";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 0f, rt: 1d, immediate(offset): 0007}", actualInstruction);
	}
	@Test
	public void test603() {
		String hexCode = "24520058";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 02, rt: 12, immediate(offset): 0058}", actualInstruction);
	}
	@Test
	public void test604() {
		String hexCode = "169200eb";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 14, rt: 12, immediate(offset): 00eb}", actualInstruction);
	}
	@Test
	public void test605() {
		String hexCode = "ae5efffd";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 12, rt: 1e, immediate(offset): fffd}", actualInstruction);
	}
	@Test
	public void test606() {
		String hexCode = "24a50082";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 05, rt: 05, immediate(offset): 0082}", actualInstruction);
	}
	@Test
	public void test607() {
		String hexCode = "004f0024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 02, rt: 0f, rd: 00, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test608() {
		String hexCode = "379c0049";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 1c, rt: 1c, immediate(offset): 0049}", actualInstruction);
	}
	@Test
	public void test609() {
		String hexCode = "1681003d";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 14, rt: 01, immediate(offset): 003d}", actualInstruction);
	}
	@Test
	public void test610() {
		String hexCode = "aeb20000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 15, rt: 12, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test611() {
		String hexCode = "318e00ce";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 0c, rt: 0e, immediate(offset): 00ce}", actualInstruction);
	}
	@Test
	public void test612() {
		String hexCode = "14dcfff1";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 06, rt: 1c, immediate(offset): fff1}", actualInstruction);
	}
	@Test
	public void test613() {
		String hexCode = "ad9d0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 0c, rt: 1d, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test614() {
		String hexCode = "10d7ffcb";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 06, rt: 17, immediate(offset): ffcb}", actualInstruction);
	}
	@Test
	public void test615() {
		String hexCode = "37a90043";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 1d, rt: 09, immediate(offset): 0043}", actualInstruction);
	}
	@Test
	public void test616() {
		String hexCode = "8e68ff83";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 13, rt: 08, immediate(offset): ff83}", actualInstruction);
	}
	@Test
	public void test617() {
		String hexCode = "3c040098";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 04, immediate(offset): 0098}", actualInstruction);
	}
	@Test
	public void test618() {
		String hexCode = "8e9000b7";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 14, rt: 10, immediate(offset): 00b7}", actualInstruction);
	}
	@Test
	public void test619() {
		String hexCode = "01619025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 0b, rt: 01, rd: 12, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test620() {
		String hexCode = "24c50039";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 06, rt: 05, immediate(offset): 0039}", actualInstruction);
	}
	@Test
	public void test621() {
		String hexCode = "8f8d00fe";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 1c, rt: 0d, immediate(offset): 00fe}", actualInstruction);
	}
	@Test
	public void test622() {
		String hexCode = "33adffe1";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 1d, rt: 0d, immediate(offset): ffe1}", actualInstruction);
	}
	@Test
	public void test623() {
		String hexCode = "1106ffb2";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 08, rt: 06, immediate(offset): ffb2}", actualInstruction);
	}
	@Test
	public void test624() {
		String hexCode = "038be022";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 1c, rt: 0b, rd: 1c, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test625() {
		String hexCode = "34df004c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 06, rt: 1f, immediate(offset): 004c}", actualInstruction);
	}
	@Test
	public void test626() {
		String hexCode = "03b33022";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 1d, rt: 13, rd: 06, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test627() {
		String hexCode = "8d2e0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 09, rt: 0e, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test628() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test629() {
		String hexCode = "11090041";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 08, rt: 09, immediate(offset): 0041}", actualInstruction);
	}
	@Test
	public void test630() {
		String hexCode = "01664020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 0b, rt: 06, rd: 08, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test631() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test632() {
		String hexCode = "37e4004b";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 1f, rt: 04, immediate(offset): 004b}", actualInstruction);
	}
	@Test
	public void test633() {
		String hexCode = "acaffffd";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 05, rt: 0f, immediate(offset): fffd}", actualInstruction);
	}
	@Test
	public void test634() {
		String hexCode = "03b9e022";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 1d, rt: 19, rd: 1c, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test635() {
		String hexCode = "01b60824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 0d, rt: 16, rd: 01, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test636() {
		String hexCode = "8d720000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 0b, rt: 12, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test637() {
		String hexCode = "03030822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 18, rt: 03, rd: 01, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test638() {
		String hexCode = "afd30001";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 1e, rt: 13, immediate(offset): 0001}", actualInstruction);
	}
	@Test
	public void test639() {
		String hexCode = "8ec30000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 16, rt: 03, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test640() {
		String hexCode = "3c10009f";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 10, immediate(offset): 009f}", actualInstruction);
	}
	@Test
	public void test641() {
		String hexCode = "333c00a1";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 19, rt: 1c, immediate(offset): 00a1}", actualInstruction);
	}
	@Test
	public void test642() {
		String hexCode = "3c1c0056";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 1c, immediate(offset): 0056}", actualInstruction);
	}
	@Test
	public void test643() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test644() {
		String hexCode = "178b0041";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 1c, rt: 0b, immediate(offset): 0041}", actualInstruction);
	}
	@Test
	public void test645() {
		String hexCode = "ae200000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 11, rt: 00, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test646() {
		String hexCode = "11ae0098";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 0d, rt: 0e, immediate(offset): 0098}", actualInstruction);
	}
	@Test
	public void test647() {
		String hexCode = "02e3182a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 17, rt: 03, rd: 03, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test648() {
		String hexCode = "10e6008e";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 07, rt: 06, immediate(offset): 008e}", actualInstruction);
	}
	@Test
	public void test649() {
		String hexCode = "13c2ff8d";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 1e, rt: 02, immediate(offset): ff8d}", actualInstruction);
	}
	@Test
	public void test650() {
		String hexCode = "11550052";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 0a, rt: 15, immediate(offset): 0052}", actualInstruction);
	}
	@Test
	public void test651() {
		String hexCode = "af87ff21";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 1c, rt: 07, immediate(offset): ff21}", actualInstruction);
	}
	@Test
	public void test652() {
		String hexCode = "01695024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 0b, rt: 09, rd: 0a, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test653() {
		String hexCode = "8dac0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 0d, rt: 0c, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test654() {
		String hexCode = "012d1025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 09, rt: 0d, rd: 02, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test655() {
		String hexCode = "3569ff01";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 0b, rt: 09, immediate(offset): ff01}", actualInstruction);
	}
	@Test
	public void test656() {
		String hexCode = "08000006";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 0000006}", actualInstruction);
	}
	@Test
	public void test657() {
		String hexCode = "34e5ff9b";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 07, rt: 05, immediate(offset): ff9b}", actualInstruction);
	}
	@Test
	public void test658() {
		String hexCode = "0800004c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 000004c}", actualInstruction);
	}
	@Test
	public void test659() {
		String hexCode = "142600e8";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 01, rt: 06, immediate(offset): 00e8}", actualInstruction);
	}
	@Test
	public void test660() {
		String hexCode = "1400ff55";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 00, rt: 00, immediate(offset): ff55}", actualInstruction);
	}
	@Test
	public void test661() {
		String hexCode = "01cee024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 0e, rt: 0e, rd: 1c, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test662() {
		String hexCode = "3235ffb9";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 11, rt: 15, immediate(offset): ffb9}", actualInstruction);
	}
	@Test
	public void test663() {
		String hexCode = "1208005e";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 10, rt: 08, immediate(offset): 005e}", actualInstruction);
	}
	@Test
	public void test664() {
		String hexCode = "10770042";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 03, rt: 17, immediate(offset): 0042}", actualInstruction);
	}
	@Test
	public void test665() {
		String hexCode = "aca2ffee";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 05, rt: 02, immediate(offset): ffee}", actualInstruction);
	}
	@Test
	public void test666() {
		String hexCode = "3090ff4d";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 04, rt: 10, immediate(offset): ff4d}", actualInstruction);
	}
	@Test
	public void test667() {
		String hexCode = "00724824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 03, rt: 12, rd: 09, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test668() {
		String hexCode = "3554ffa2";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 0a, rt: 14, immediate(offset): ffa2}", actualInstruction);
	}
	@Test
	public void test669() {
		String hexCode = "3c020062";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 02, immediate(offset): 0062}", actualInstruction);
	}
	@Test
	public void test670() {
		String hexCode = "13590092";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 1a, rt: 19, immediate(offset): 0092}", actualInstruction);
	}
	@Test
	public void test671() {
		String hexCode = "114800fa";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 0a, rt: 08, immediate(offset): 00fa}", actualInstruction);
	}
	@Test
	public void test672() {
		String hexCode = "0344202a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 1a, rt: 04, rd: 04, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test673() {
		String hexCode = "02b2682a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 15, rt: 12, rd: 0d, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test674() {
		String hexCode = "27e3007f";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 1f, rt: 03, immediate(offset): 007f}", actualInstruction);
	}
	@Test
	public void test675() {
		String hexCode = "00958025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 04, rt: 15, rd: 10, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test676() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test677() {
		String hexCode = "0357702a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 1a, rt: 17, rd: 0e, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test678() {
		String hexCode = "0207b02a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 10, rt: 07, rd: 16, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test679() {
		String hexCode = "02664822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 13, rt: 06, rd: 09, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test680() {
		String hexCode = "37aa0004";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 1d, rt: 0a, immediate(offset): 0004}", actualInstruction);
	}
	@Test
	public void test681() {
		String hexCode = "0336f025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 19, rt: 16, rd: 1e, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test682() {
		String hexCode = "144cff60";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 02, rt: 0c, immediate(offset): ff60}", actualInstruction);
	}
	@Test
	public void test683() {
		String hexCode = "14bb0004";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 05, rt: 1b, immediate(offset): 0004}", actualInstruction);
	}
	@Test
	public void test684() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test685() {
		String hexCode = "136c00b6";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 1b, rt: 0c, immediate(offset): 00b6}", actualInstruction);
	}
	@Test
	public void test686() {
		String hexCode = "27cd0035";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 1e, rt: 0d, immediate(offset): 0035}", actualInstruction);
	}
	@Test
	public void test687() {
		String hexCode = "ac7d0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 03, rt: 1d, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test688() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test689() {
		String hexCode = "3c0f0058";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 0f, immediate(offset): 0058}", actualInstruction);
	}
	@Test
	public void test690() {
		String hexCode = "acd00000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 06, rt: 10, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test691() {
		String hexCode = "af600077";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 1b, rt: 00, immediate(offset): 0077}", actualInstruction);
	}
	@Test
	public void test692() {
		String hexCode = "3c0900ec";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 09, immediate(offset): 00ec}", actualInstruction);
	}
	@Test
	public void test693() {
		String hexCode = "01ad582a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 0d, rt: 0d, rd: 0b, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test694() {
		String hexCode = "080000e1";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 00000e1}", actualInstruction);
	}
	@Test
	public void test695() {
		String hexCode = "8c2e003f";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 01, rt: 0e, immediate(offset): 003f}", actualInstruction);
	}
	@Test
	public void test696() {
		String hexCode = "10f700e3";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 07, rt: 17, immediate(offset): 00e3}", actualInstruction);
	}
	@Test
	public void test697() {
		String hexCode = "03f51025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 1f, rt: 15, rd: 02, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test698() {
		String hexCode = "317900af";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 0b, rt: 19, immediate(offset): 00af}", actualInstruction);
	}
	@Test
	public void test699() {
		String hexCode = "26fd007c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 17, rt: 1d, immediate(offset): 007c}", actualInstruction);
	}
	@Test
	public void test700() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test701() {
		String hexCode = "8fe7ffb6";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 1f, rt: 07, immediate(offset): ffb6}", actualInstruction);
	}
	@Test
	public void test702() {
		String hexCode = "02cf5025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 16, rt: 0f, rd: 0a, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test703() {
		String hexCode = "080000e2";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 00000e2}", actualInstruction);
	}
	@Test
	public void test704() {
		String hexCode = "3c040030";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 04, immediate(offset): 0030}", actualInstruction);
	}
	@Test
	public void test705() {
		String hexCode = "3005002c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 00, rt: 05, immediate(offset): 002c}", actualInstruction);
	}
	@Test
	public void test706() {
		String hexCode = "03e99820";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 1f, rt: 09, rd: 13, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test707() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test708() {
		String hexCode = "3703ff45";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 18, rt: 03, immediate(offset): ff45}", actualInstruction);
	}
	@Test
	public void test709() {
		String hexCode = "2776008f";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 1b, rt: 16, immediate(offset): 008f}", actualInstruction);
	}
	@Test
	public void test710() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test711() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test712() {
		String hexCode = "3173ffa8";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 0b, rt: 13, immediate(offset): ffa8}", actualInstruction);
	}
	@Test
	public void test713() {
		String hexCode = "1422ff98";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 01, rt: 02, immediate(offset): ff98}", actualInstruction);
	}
	@Test
	public void test714() {
		String hexCode = "3790ff41";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 1c, rt: 10, immediate(offset): ff41}", actualInstruction);
	}
	@Test
	public void test715() {
		String hexCode = "080000e9";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 00000e9}", actualInstruction);
	}
	@Test
	public void test716() {
		String hexCode = "373bff4c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 19, rt: 1b, immediate(offset): ff4c}", actualInstruction);
	}
	@Test
	public void test717() {
		String hexCode = "01f8e020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 0f, rt: 18, rd: 1c, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test718() {
		String hexCode = "025a9022";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 12, rt: 1a, rd: 12, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test719() {
		String hexCode = "260f00ae";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 10, rt: 0f, immediate(offset): 00ae}", actualInstruction);
	}
	@Test
	public void test720() {
		String hexCode = "0210902a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 10, rt: 10, rd: 12, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test721() {
		String hexCode = "02c99824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 16, rt: 09, rd: 13, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test722() {
		String hexCode = "02331822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 11, rt: 13, rd: 03, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test723() {
		String hexCode = "10500049";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 02, rt: 10, immediate(offset): 0049}", actualInstruction);
	}
	@Test
	public void test724() {
		String hexCode = "aead0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 15, rt: 0d, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test725() {
		String hexCode = "02315822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 11, rt: 11, rd: 0b, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test726() {
		String hexCode = "039b1822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 1c, rt: 1b, rd: 03, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test727() {
		String hexCode = "11ca00bb";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 0e, rt: 0a, immediate(offset): 00bb}", actualInstruction);
	}
	@Test
	public void test728() {
		String hexCode = "03f9d022";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 1f, rt: 19, rd: 1a, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test729() {
		String hexCode = "02bad022";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 15, rt: 1a, rd: 1a, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test730() {
		String hexCode = "3473ff4f";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 03, rt: 13, immediate(offset): ff4f}", actualInstruction);
	}
	@Test
	public void test731() {
		String hexCode = "1051ffbb";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 02, rt: 11, immediate(offset): ffbb}", actualInstruction);
	}
	@Test
	public void test732() {
		String hexCode = "02034822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 10, rt: 03, rd: 09, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test733() {
		String hexCode = "1480006c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 04, rt: 00, immediate(offset): 006c}", actualInstruction);
	}
	@Test
	public void test734() {
		String hexCode = "039fd024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 1c, rt: 1f, rd: 1a, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test735() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test736() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test737() {
		String hexCode = "3c0b007a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 0b, immediate(offset): 007a}", actualInstruction);
	}
	@Test
	public void test738() {
		String hexCode = "3c1a004e";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 1a, immediate(offset): 004e}", actualInstruction);
	}
	@Test
	public void test739() {
		String hexCode = "00463820";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 02, rt: 06, rd: 07, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test740() {
		String hexCode = "134dff98";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 1a, rt: 0d, immediate(offset): ff98}", actualInstruction);
	}
	@Test
	public void test741() {
		String hexCode = "037c482a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 1b, rt: 1c, rd: 09, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test742() {
		String hexCode = "378dff77";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 1c, rt: 0d, immediate(offset): ff77}", actualInstruction);
	}
	@Test
	public void test743() {
		String hexCode = "37aa00a6";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 1d, rt: 0a, immediate(offset): 00a6}", actualInstruction);
	}
	@Test
	public void test744() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test745() {
		String hexCode = "14f2fffd";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 07, rt: 12, immediate(offset): fffd}", actualInstruction);
	}
	@Test
	public void test746() {
		String hexCode = "3285ffc4";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 14, rt: 05, immediate(offset): ffc4}", actualInstruction);
	}
	@Test
	public void test747() {
		String hexCode = "01372020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 09, rt: 17, rd: 04, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test748() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test749() {
		String hexCode = "8d9a0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 0c, rt: 1a, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test750() {
		String hexCode = "03e8c020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 1f, rt: 08, rd: 18, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test751() {
		String hexCode = "01c21820";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 0e, rt: 02, rd: 03, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test752() {
		String hexCode = "00e3e025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 07, rt: 03, rd: 1c, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test753() {
		String hexCode = "aefc0052";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 17, rt: 1c, immediate(offset): 0052}", actualInstruction);
	}
	@Test
	public void test754() {
		String hexCode = "325f001c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 12, rt: 1f, immediate(offset): 001c}", actualInstruction);
	}
	@Test
	public void test755() {
		String hexCode = "0251f824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 12, rt: 11, rd: 1f, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test756() {
		String hexCode = "34eb0003";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 07, rt: 0b, immediate(offset): 0003}", actualInstruction);
	}
	@Test
	public void test757() {
		String hexCode = "11c5ff06";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 0e, rt: 05, immediate(offset): ff06}", actualInstruction);
	}
	@Test
	public void test758() {
		String hexCode = "10caffbd";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 06, rt: 0a, immediate(offset): ffbd}", actualInstruction);
	}
	@Test
	public void test759() {
		String hexCode = "301a0081";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 00, rt: 1a, immediate(offset): 0081}", actualInstruction);
	}
	@Test
	public void test760() {
		String hexCode = "02e1982a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 17, rt: 01, rd: 13, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test761() {
		String hexCode = "01549020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 0a, rt: 14, rd: 12, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test762() {
		String hexCode = "02188822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 10, rt: 18, rd: 11, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test763() {
		String hexCode = "ad5dff47";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 0a, rt: 1d, immediate(offset): ff47}", actualInstruction);
	}
	@Test
	public void test764() {
		String hexCode = "319aff74";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 0c, rt: 1a, immediate(offset): ff74}", actualInstruction);
	}
	@Test
	public void test765() {
		String hexCode = "3614ff08";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 10, rt: 14, immediate(offset): ff08}", actualInstruction);
	}
	@Test
	public void test766() {
		String hexCode = "8c460000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 02, rt: 06, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test767() {
		String hexCode = "018a3024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 0c, rt: 0a, rd: 06, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test768() {
		String hexCode = "35730084";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 0b, rt: 13, immediate(offset): 0084}", actualInstruction);
	}
	@Test
	public void test769() {
		String hexCode = "af47ffa0";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 1a, rt: 07, immediate(offset): ffa0}", actualInstruction);
	}
	@Test
	public void test770() {
		String hexCode = "0086d822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 04, rt: 06, rd: 1b, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test771() {
		String hexCode = "26350035";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 11, rt: 15, immediate(offset): 0035}", actualInstruction);
	}
	@Test
	public void test772() {
		String hexCode = "ad590000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 0a, rt: 19, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test773() {
		String hexCode = "333000d3";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 19, rt: 10, immediate(offset): 00d3}", actualInstruction);
	}
	@Test
	public void test774() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test775() {
		String hexCode = "32c5ffcc";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 16, rt: 05, immediate(offset): ffcc}", actualInstruction);
	}
	@Test
	public void test776() {
		String hexCode = "01c25024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 0e, rt: 02, rd: 0a, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test777() {
		String hexCode = "31770000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 0b, rt: 17, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test778() {
		String hexCode = "af510000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 1a, rt: 11, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test779() {
		String hexCode = "ac710000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 03, rt: 11, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test780() {
		String hexCode = "3326006c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 19, rt: 06, immediate(offset): 006c}", actualInstruction);
	}
	@Test
	public void test781() {
		String hexCode = "8c200000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 01, rt: 00, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test782() {
		String hexCode = "264d0007";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 12, rt: 0d, immediate(offset): 0007}", actualInstruction);
	}
	@Test
	public void test783() {
		String hexCode = "af150097";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 18, rt: 15, immediate(offset): 0097}", actualInstruction);
	}
	@Test
	public void test784() {
		String hexCode = "03145825";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 18, rt: 14, rd: 0b, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test785() {
		String hexCode = "32acffab";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 15, rt: 0c, immediate(offset): ffab}", actualInstruction);
	}
	@Test
	public void test786() {
		String hexCode = "37c70053";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 1e, rt: 07, immediate(offset): 0053}", actualInstruction);
	}
	@Test
	public void test787() {
		String hexCode = "261e0066";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 10, rt: 1e, immediate(offset): 0066}", actualInstruction);
	}
	@Test
	public void test788() {
		String hexCode = "000e382a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 00, rt: 0e, rd: 07, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test789() {
		String hexCode = "01e9e022";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 0f, rt: 09, rd: 1c, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test790() {
		String hexCode = "ad580000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 0a, rt: 18, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test791() {
		String hexCode = "080000af";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 00000af}", actualInstruction);
	}
	@Test
	public void test792() {
		String hexCode = "03b25025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 1d, rt: 12, rd: 0a, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test793() {
		String hexCode = "8e440062";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 12, rt: 04, immediate(offset): 0062}", actualInstruction);
	}
	@Test
	public void test794() {
		String hexCode = "144effe4";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 02, rt: 0e, immediate(offset): ffe4}", actualInstruction);
	}
	@Test
	public void test795() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test796() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test797() {
		String hexCode = "012f2022";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 09, rt: 0f, rd: 04, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test798() {
		String hexCode = "03aa2024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 1d, rt: 0a, rd: 04, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test799() {
		String hexCode = "02204820";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 11, rt: 00, rd: 09, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test800() {
		String hexCode = "080000fd";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 00000fd}", actualInstruction);
	}
	@Test
	public void test801() {
		String hexCode = "01c91025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 0e, rt: 09, rd: 02, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test802() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test803() {
		String hexCode = "24f1000b";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 07, rt: 11, immediate(offset): 000b}", actualInstruction);
	}
	@Test
	public void test804() {
		String hexCode = "02b3002a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 15, rt: 13, rd: 00, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test805() {
		String hexCode = "3745ffd0";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 1a, rt: 05, immediate(offset): ffd0}", actualInstruction);
	}
	@Test
	public void test806() {
		String hexCode = "03d98020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 1e, rt: 19, rd: 10, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test807() {
		String hexCode = "3c1100fc";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 11, immediate(offset): 00fc}", actualInstruction);
	}
	@Test
	public void test808() {
		String hexCode = "0800004e";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 000004e}", actualInstruction);
	}
	@Test
	public void test809() {
		String hexCode = "32e7ffcb";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 17, rt: 07, immediate(offset): ffcb}", actualInstruction);
	}
	@Test
	public void test810() {
		String hexCode = "01b80025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 0d, rt: 18, rd: 00, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test811() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test812() {
		String hexCode = "2733002e";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 19, rt: 13, immediate(offset): 002e}", actualInstruction);
	}
	@Test
	public void test813() {
		String hexCode = "8f82ffd3";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 1c, rt: 02, immediate(offset): ffd3}", actualInstruction);
	}
	@Test
	public void test814() {
		String hexCode = "01a02022";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 0d, rt: 00, rd: 04, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test815() {
		String hexCode = "035b382a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 1a, rt: 1b, rd: 07, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test816() {
		String hexCode = "08000059";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 0000059}", actualInstruction);
	}
	@Test
	public void test817() {
		String hexCode = "01d5c824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 0e, rt: 15, rd: 19, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test818() {
		String hexCode = "8c00000f";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 00, rt: 00, immediate(offset): 000f}", actualInstruction);
	}
	@Test
	public void test819() {
		String hexCode = "30c3009f";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 06, rt: 03, immediate(offset): 009f}", actualInstruction);
	}
	@Test
	public void test820() {
		String hexCode = "109800e2";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 04, rt: 18, immediate(offset): 00e2}", actualInstruction);
	}
	@Test
	public void test821() {
		String hexCode = "24e200fc";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 07, rt: 02, immediate(offset): 00fc}", actualInstruction);
	}
	@Test
	public void test822() {
		String hexCode = "af990000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 1c, rt: 19, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test823() {
		String hexCode = "0021a020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 01, rt: 01, rd: 14, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test824() {
		String hexCode = "039f9824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 1c, rt: 1f, rd: 13, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test825() {
		String hexCode = "080000c1";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 00000c1}", actualInstruction);
	}
	@Test
	public void test826() {
		String hexCode = "adf60000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 0f, rt: 16, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test827() {
		String hexCode = "02b6b82a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 15, rt: 16, rd: 17, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test828() {
		String hexCode = "246f00f6";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 03, rt: 0f, immediate(offset): 00f6}", actualInstruction);
	}
	@Test
	public void test829() {
		String hexCode = "8ea30000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 15, rt: 03, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test830() {
		String hexCode = "33940080";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 1c, rt: 14, immediate(offset): 0080}", actualInstruction);
	}
	@Test
	public void test831() {
		String hexCode = "2449005e";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 02, rt: 09, immediate(offset): 005e}", actualInstruction);
	}
	@Test
	public void test832() {
		String hexCode = "034b6024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 1a, rt: 0b, rd: 0c, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test833() {
		String hexCode = "02f55822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 17, rt: 15, rd: 0b, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test834() {
		String hexCode = "001cf820";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 00, rt: 1c, rd: 1f, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test835() {
		String hexCode = "024a6024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 12, rt: 0a, rd: 0c, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test836() {
		String hexCode = "14d8ffa2";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 06, rt: 18, immediate(offset): ffa2}", actualInstruction);
	}
	@Test
	public void test837() {
		String hexCode = "11b1ff05";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 0d, rt: 11, immediate(offset): ff05}", actualInstruction);
	}
	@Test
	public void test838() {
		String hexCode = "34f70034";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 07, rt: 17, immediate(offset): 0034}", actualInstruction);
	}
	@Test
	public void test839() {
		String hexCode = "360c0042";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 10, rt: 0c, immediate(offset): 0042}", actualInstruction);
	}
	@Test
	public void test840() {
		String hexCode = "01c31022";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 0e, rt: 03, rd: 02, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test841() {
		String hexCode = "31a9ffa9";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 0d, rt: 09, immediate(offset): ffa9}", actualInstruction);
	}
	@Test
	public void test842() {
		String hexCode = "151e0006";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 08, rt: 1e, immediate(offset): 0006}", actualInstruction);
	}
	@Test
	public void test843() {
		String hexCode = "afc3ffeb";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 1e, rt: 03, immediate(offset): ffeb}", actualInstruction);
	}
	@Test
	public void test844() {
		String hexCode = "080000a4";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 00000a4}", actualInstruction);
	}
	@Test
	public void test845() {
		String hexCode = "33310091";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 19, rt: 11, immediate(offset): 0091}", actualInstruction);
	}
	@Test
	public void test846() {
		String hexCode = "02c16824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 16, rt: 01, rd: 0d, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test847() {
		String hexCode = "ac930000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 04, rt: 13, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test848() {
		String hexCode = "01d3e825";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 0e, rt: 13, rd: 1d, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test849() {
		String hexCode = "080000b5";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 00000b5}", actualInstruction);
	}
	@Test
	public void test850() {
		String hexCode = "8ffe003e";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 1f, rt: 1e, immediate(offset): 003e}", actualInstruction);
	}
	@Test
	public void test851() {
		String hexCode = "3c09006b";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 09, immediate(offset): 006b}", actualInstruction);
	}
	@Test
	public void test852() {
		String hexCode = "15c1ffa2";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 0e, rt: 01, immediate(offset): ffa2}", actualInstruction);
	}
	@Test
	public void test853() {
		String hexCode = "039d482a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 1c, rt: 1d, rd: 09, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test854() {
		String hexCode = "15dcff3a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 0e, rt: 1c, immediate(offset): ff3a}", actualInstruction);
	}
	@Test
	public void test855() {
		String hexCode = "0078b024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 03, rt: 18, rd: 16, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test856() {
		String hexCode = "010a8820";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 08, rt: 0a, rd: 11, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test857() {
		String hexCode = "8f860000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 1c, rt: 06, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test858() {
		String hexCode = "0082582a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 04, rt: 02, rd: 0b, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test859() {
		String hexCode = "0800008a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 000008a}", actualInstruction);
	}
	@Test
	public void test860() {
		String hexCode = "3c05008a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 05, immediate(offset): 008a}", actualInstruction);
	}
	@Test
	public void test861() {
		String hexCode = "adb4ffe0";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 0d, rt: 14, immediate(offset): ffe0}", actualInstruction);
	}
	@Test
	public void test862() {
		String hexCode = "266a0025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 13, rt: 0a, immediate(offset): 0025}", actualInstruction);
	}
	@Test
	public void test863() {
		String hexCode = "3740ff13";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 1a, rt: 00, immediate(offset): ff13}", actualInstruction);
	}
	@Test
	public void test864() {
		String hexCode = "0217b82a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 10, rt: 17, rd: 17, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test865() {
		String hexCode = "3c0f002b";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 0f, immediate(offset): 002b}", actualInstruction);
	}
	@Test
	public void test866() {
		String hexCode = "8ebd00ac";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 15, rt: 1d, immediate(offset): 00ac}", actualInstruction);
	}
	@Test
	public void test867() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test868() {
		String hexCode = "02628820";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 13, rt: 02, rd: 11, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test869() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test870() {
		String hexCode = "8d550000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 0a, rt: 15, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test871() {
		String hexCode = "126dffc2";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 13, rt: 0d, immediate(offset): ffc2}", actualInstruction);
	}
	@Test
	public void test872() {
		String hexCode = "00b6f025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 05, rt: 16, rd: 1e, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test873() {
		String hexCode = "35ca0027";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 0e, rt: 0a, immediate(offset): 0027}", actualInstruction);
	}
	@Test
	public void test874() {
		String hexCode = "35aeffa8";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 0d, rt: 0e, immediate(offset): ffa8}", actualInstruction);
	}
	@Test
	public void test875() {
		String hexCode = "af2bff38";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 19, rt: 0b, immediate(offset): ff38}", actualInstruction);
	}
	@Test
	public void test876() {
		String hexCode = "addeffd2";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 0e, rt: 1e, immediate(offset): ffd2}", actualInstruction);
	}
	@Test
	public void test877() {
		String hexCode = "0015382a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 00, rt: 15, rd: 07, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test878() {
		String hexCode = "8f5a0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 1a, rt: 1a, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test879() {
		String hexCode = "0077e024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 03, rt: 17, rd: 1c, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test880() {
		String hexCode = "080000a9";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 00000a9}", actualInstruction);
	}
	@Test
	public void test881() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test882() {
		String hexCode = "00ddf025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 06, rt: 1d, rd: 1e, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test883() {
		String hexCode = "02b42022";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 15, rt: 14, rd: 04, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test884() {
		String hexCode = "12fdffcf";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 17, rt: 1d, immediate(offset): ffcf}", actualInstruction);
	}
	@Test
	public void test885() {
		String hexCode = "02bd7822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 15, rt: 1d, rd: 0f, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test886() {
		String hexCode = "3c0a00ed";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 0a, immediate(offset): 00ed}", actualInstruction);
	}
	@Test
	public void test887() {
		String hexCode = "8d7f0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 0b, rt: 1f, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test888() {
		String hexCode = "03df182a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 1e, rt: 1f, rd: 03, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test889() {
		String hexCode = "34a7009b";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 05, rt: 07, immediate(offset): 009b}", actualInstruction);
	}
	@Test
	public void test890() {
		String hexCode = "368900c7";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 14, rt: 09, immediate(offset): 00c7}", actualInstruction);
	}
	@Test
	public void test891() {
		String hexCode = "33d20023";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 1e, rt: 12, immediate(offset): 0023}", actualInstruction);
	}
	@Test
	public void test892() {
		String hexCode = "0232c82a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 11, rt: 12, rd: 19, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test893() {
		String hexCode = "aff4ff4e";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 1f, rt: 14, immediate(offset): ff4e}", actualInstruction);
	}
	@Test
	public void test894() {
		String hexCode = "0121f022";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 09, rt: 01, rd: 1e, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test895() {
		String hexCode = "01bf2022";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 0d, rt: 1f, rd: 04, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test896() {
		String hexCode = "031ae020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 18, rt: 1a, rd: 1c, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test897() {
		String hexCode = "00a0a024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 05, rt: 00, rd: 14, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test898() {
		String hexCode = "3c0d00bd";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 0d, immediate(offset): 00bd}", actualInstruction);
	}
	@Test
	public void test899() {
		String hexCode = "3c1700a1";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 17, immediate(offset): 00a1}", actualInstruction);
	}
	@Test
	public void test900() {
		String hexCode = "374b0033";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 1a, rt: 0b, immediate(offset): 0033}", actualInstruction);
	}
	@Test
	public void test901() {
		String hexCode = "8e4cffd4";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 12, rt: 0c, immediate(offset): ffd4}", actualInstruction);
	}
	@Test
	public void test902() {
		String hexCode = "3c0400c5";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 04, immediate(offset): 00c5}", actualInstruction);
	}
	@Test
	public void test903() {
		String hexCode = "03a67822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 1d, rt: 06, rd: 0f, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test904() {
		String hexCode = "3266ff37";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 13, rt: 06, immediate(offset): ff37}", actualInstruction);
	}
	@Test
	public void test905() {
		String hexCode = "3c09003c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 09, immediate(offset): 003c}", actualInstruction);
	}
	@Test
	public void test906() {
		String hexCode = "01424025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 0a, rt: 02, rd: 08, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test907() {
		String hexCode = "33f80042";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 1f, rt: 18, immediate(offset): 0042}", actualInstruction);
	}
	@Test
	public void test908() {
		String hexCode = "34150046";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 00, rt: 15, immediate(offset): 0046}", actualInstruction);
	}
	@Test
	public void test909() {
		String hexCode = "110fff9c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 08, rt: 0f, immediate(offset): ff9c}", actualInstruction);
	}
	@Test
	public void test910() {
		String hexCode = "8cba0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 05, rt: 1a, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test911() {
		String hexCode = "ad010000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 08, rt: 01, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test912() {
		String hexCode = "1327ffd0";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 19, rt: 07, immediate(offset): ffd0}", actualInstruction);
	}
	@Test
	public void test913() {
		String hexCode = "029bf824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 14, rt: 1b, rd: 1f, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test914() {
		String hexCode = "08000050";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 0000050}", actualInstruction);
	}
	@Test
	public void test915() {
		String hexCode = "3c1c008a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 1c, immediate(offset): 008a}", actualInstruction);
	}
	@Test
	public void test916() {
		String hexCode = "307bffba";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 03, rt: 1b, immediate(offset): ffba}", actualInstruction);
	}
	@Test
	public void test917() {
		String hexCode = "26500012";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 12, rt: 10, immediate(offset): 0012}", actualInstruction);
	}
	@Test
	public void test918() {
		String hexCode = "0800004d";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 000004d}", actualInstruction);
	}
	@Test
	public void test919() {
		String hexCode = "02f83024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 17, rt: 18, rd: 06, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test920() {
		String hexCode = "8cda0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 06, rt: 1a, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test921() {
		String hexCode = "03a57020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 1d, rt: 05, rd: 0e, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test922() {
		String hexCode = "03c01025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 1e, rt: 00, rd: 02, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test923() {
		String hexCode = "12e100ec";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 17, rt: 01, immediate(offset): 00ec}", actualInstruction);
	}
	@Test
	public void test924() {
		String hexCode = "8d41ff43";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 0a, rt: 01, immediate(offset): ff43}", actualInstruction);
	}
	@Test
	public void test925() {
		String hexCode = "03674824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 1b, rt: 07, rd: 09, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test926() {
		String hexCode = "256500e4";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 0b, rt: 05, immediate(offset): 00e4}", actualInstruction);
	}
	@Test
	public void test927() {
		String hexCode = "3192ff63";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 0c, rt: 12, immediate(offset): ff63}", actualInstruction);
	}
	@Test
	public void test928() {
		String hexCode = "1682ff18";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 14, rt: 02, immediate(offset): ff18}", actualInstruction);
	}
	@Test
	public void test929() {
		String hexCode = "15bc0023";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 0d, rt: 1c, immediate(offset): 0023}", actualInstruction);
	}
	@Test
	public void test930() {
		String hexCode = "03db0024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 1e, rt: 1b, rd: 00, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test931() {
		String hexCode = "ae3f0011";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 11, rt: 1f, immediate(offset): 0011}", actualInstruction);
	}
	@Test
	public void test932() {
		String hexCode = "08000040";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 0000040}", actualInstruction);
	}
	@Test
	public void test933() {
		String hexCode = "110cff63";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 08, rt: 0c, immediate(offset): ff63}", actualInstruction);
	}
	@Test
	public void test934() {
		String hexCode = "08000038";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 0000038}", actualInstruction);
	}
	@Test
	public void test935() {
		String hexCode = "338a0070";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 1c, rt: 0a, immediate(offset): 0070}", actualInstruction);
	}
	@Test
	public void test936() {
		String hexCode = "015be020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 0a, rt: 1b, rd: 1c, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test937() {
		String hexCode = "3c0700a2";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 07, immediate(offset): 00a2}", actualInstruction);
	}
	@Test
	public void test938() {
		String hexCode = "03518024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 1a, rt: 11, rd: 10, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test939() {
		String hexCode = "00a2402a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 05, rt: 02, rd: 08, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test940() {
		String hexCode = "361f00a7";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 10, rt: 1f, immediate(offset): 00a7}", actualInstruction);
	}
	@Test
	public void test941() {
		String hexCode = "03cd882a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 1e, rt: 0d, rd: 11, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test942() {
		String hexCode = "0255a822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 12, rt: 15, rd: 15, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test943() {
		String hexCode = "3389ff81";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 1c, rt: 09, immediate(offset): ff81}", actualInstruction);
	}
	@Test
	public void test944() {
		String hexCode = "107bffbc";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("beq {opcode: 04, rs(base): 03, rt: 1b, immediate(offset): ffbc}", actualInstruction);
	}
	@Test
	public void test945() {
		String hexCode = "3074ff4f";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 03, rt: 14, immediate(offset): ff4f}", actualInstruction);
	}
	@Test
	public void test946() {
		String hexCode = "3c0e0073";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 0e, immediate(offset): 0073}", actualInstruction);
	}
	@Test
	public void test947() {
		String hexCode = "0800000d";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 000000d}", actualInstruction);
	}
	@Test
	public void test948() {
		String hexCode = "26290049";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 11, rt: 09, immediate(offset): 0049}", actualInstruction);
	}
	@Test
	public void test949() {
		String hexCode = "02964024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 14, rt: 16, rd: 08, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test950() {
		String hexCode = "8c110098";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 00, rt: 11, immediate(offset): 0098}", actualInstruction);
	}
	@Test
	public void test951() {
		String hexCode = "01201022";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 09, rt: 00, rd: 02, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test952() {
		String hexCode = "08000096";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 0000096}", actualInstruction);
	}
	@Test
	public void test953() {
		String hexCode = "080000e5";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 00000e5}", actualInstruction);
	}
	@Test
	public void test954() {
		String hexCode = "161300ad";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 10, rt: 13, immediate(offset): 00ad}", actualInstruction);
	}
	@Test
	public void test955() {
		String hexCode = "333d00f3";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 19, rt: 1d, immediate(offset): 00f3}", actualInstruction);
	}
	@Test
	public void test956() {
		String hexCode = "31dd0048";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 0e, rt: 1d, immediate(offset): 0048}", actualInstruction);
	}
	@Test
	public void test957() {
		String hexCode = "17200024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 19, rt: 00, immediate(offset): 0024}", actualInstruction);
	}
	@Test
	public void test958() {
		String hexCode = "0104282a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 08, rt: 04, rd: 05, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test959() {
		String hexCode = "af000000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 18, rt: 00, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test960() {
		String hexCode = "30f1ffc2";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 07, rt: 11, immediate(offset): ffc2}", actualInstruction);
	}
	@Test
	public void test961() {
		String hexCode = "03ca2825";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 1e, rt: 0a, rd: 05, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test962() {
		String hexCode = "1450ff3e";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 02, rt: 10, immediate(offset): ff3e}", actualInstruction);
	}
	@Test
	public void test963() {
		String hexCode = "ad0a0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 08, rt: 0a, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test964() {
		String hexCode = "0072d02a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 03, rt: 12, rd: 1a, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test965() {
		String hexCode = "038f0025";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 1c, rt: 0f, rd: 00, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test966() {
		String hexCode = "025a5825";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 12, rt: 1a, rd: 0b, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test967() {
		String hexCode = "01d14822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 0e, rt: 11, rd: 09, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test968() {
		String hexCode = "3467ffeb";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("ori {opcode: 0d, rs(base): 03, rt: 07, immediate(offset): ffeb}", actualInstruction);
	}
	@Test
	public void test969() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test970() {
		String hexCode = "2547004d";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 0a, rt: 07, immediate(offset): 004d}", actualInstruction);
	}
	@Test
	public void test971() {
		String hexCode = "8fca0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 1e, rt: 0a, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test972() {
		String hexCode = "3c1e0082";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 1e, immediate(offset): 0082}", actualInstruction);
	}
	@Test
	public void test973() {
		String hexCode = "03329824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 19, rt: 12, rd: 13, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test974() {
		String hexCode = "035ee825";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("or {opcode: 00, rs: 1a, rt: 1e, rd: 1d, shmt: 00, funct: 25}", actualInstruction);
	}
	@Test
	public void test975() {
		String hexCode = "3c1100f9";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lui {opcode: 0f, rs(base): 00, rt: 11, immediate(offset): 00f9}", actualInstruction);
	}
	@Test
	public void test976() {
		String hexCode = "25a300a1";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 0d, rt: 03, immediate(offset): 00a1}", actualInstruction);
	}
	@Test
	public void test977() {
		String hexCode = "16a5ff2f";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("bne {opcode: 05, rs(base): 15, rt: 05, immediate(offset): ff2f}", actualInstruction);
	}
	@Test
	public void test978() {
		String hexCode = "24b00071";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 05, rt: 10, immediate(offset): 0071}", actualInstruction);
	}
	@Test
	public void test979() {
		String hexCode = "080000bd";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 00000bd}", actualInstruction);
	}
	@Test
	public void test980() {
		String hexCode = "01dcb020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 0e, rt: 1c, rd: 16, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test981() {
		String hexCode = "02fd5024";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 17, rt: 1d, rd: 0a, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test982() {
		String hexCode = "0800001a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("j {opcode: 02, index: 000001a}", actualInstruction);
	}
	@Test
	public void test983() {
		String hexCode = "31ac007b";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 0d, rt: 0c, immediate(offset): 007b}", actualInstruction);
	}
	@Test
	public void test984() {
		String hexCode = "32feffed";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 17, rt: 1e, immediate(offset): ffed}", actualInstruction);
	}
	@Test
	public void test985() {
		String hexCode = "00491820";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 02, rt: 09, rd: 03, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test986() {
		String hexCode = "32c9ff05";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 16, rt: 09, immediate(offset): ff05}", actualInstruction);
	}
	@Test
	public void test987() {
		String hexCode = "8fcf0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 1e, rt: 0f, immediate(offset): 0000}", actualInstruction);
	}
	@Test
	public void test988() {
		String hexCode = "32a80039";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("andi {opcode: 0c, rs(base): 15, rt: 08, immediate(offset): 0039}", actualInstruction);
	}
	@Test
	public void test989() {
		String hexCode = "02723822";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sub {opcode: 00, rs: 13, rt: 12, rd: 07, shmt: 00, funct: 22}", actualInstruction);
	}
	@Test
	public void test990() {
		String hexCode = "03d49824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 1e, rt: 14, rd: 13, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test991() {
		String hexCode = "8e6e0020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("lw {opcode: 23, rs(base): 13, rt: 0e, immediate(offset): 0020}", actualInstruction);
	}
	@Test
	public void test992() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test993() {
		String hexCode = "25f20002";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("addiu {opcode: 09, rs(base): 0f, rt: 12, immediate(offset): 0002}", actualInstruction);
	}
	@Test
	public void test994() {
		String hexCode = "0361302a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 1b, rt: 01, rd: 06, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test995() {
		String hexCode = "0140c020";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("add {opcode: 00, rs: 0a, rt: 00, rd: 18, shmt: 00, funct: 20}", actualInstruction);
	}
	@Test
	public void test996() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test997() {
		String hexCode = "00fc7824";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("and {opcode: 00, rs: 07, rt: 1c, rd: 0f, shmt: 00, funct: 24}", actualInstruction);
	}
	@Test
	public void test998() {
		String hexCode = "0394382a";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("slt {opcode: 00, rs: 1c, rt: 14, rd: 07, shmt: 00, funct: 2a}", actualInstruction);
	}
	@Test
	public void test999() {
		String hexCode = "0000000c";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", actualInstruction);
	}
	@Test
	public void test1000() {
		String hexCode = "adfe0000";
		int value = Integer.parseUnsignedInt(hexCode, 16);
		String actualInstruction = MIPSSimulator.decodeInstruction(value);
		assertEquals("sw {opcode: 2b, rs(base): 0f, rt: 1e, immediate(offset): 0000}", actualInstruction);
	}
}