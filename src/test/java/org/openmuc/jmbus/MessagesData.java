/**
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.openmuc.jmbus;

import java.util.ArrayList;
import java.util.Arrays;

public class MessagesData {
    /** RESP-UD EMH DIZ */
    static final byte[] testMsg1 = new byte[] { (byte) 0x68, (byte) 0x21, (byte) 0x21, (byte) 0x68, (byte) 0x08,
            (byte) 0x01, (byte) 0x72, (byte) 0x02, (byte) 0x37, (byte) 0x62, (byte) 0x00, (byte) 0xa8, (byte) 0x15,
            (byte) 0x00, (byte) 0x02, (byte) 0x07, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8c, (byte) 0x10,
            (byte) 0x04, (byte) 0x09, (byte) 0x04, (byte) 0x00, (byte) 0x00, (byte) 0xc4, (byte) 0x00, (byte) 0x2a,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x01, (byte) 0xfd, (byte) 0x17, (byte) 0x00,
            (byte) 0x8c, (byte) 0x16 };

    /** RESP-UD NZR DHZ 5/63 M-BUS 2/230-1 single phase meter */
    static final byte[] testMsg2 = new byte[] { (byte) 0x68, (byte) 0x32, (byte) 0x32, (byte) 0x68, (byte) 0x08,
            (byte) 0x05, (byte) 0x72, (byte) 0x08, (byte) 0x06, (byte) 0x10, (byte) 0x30, (byte) 0x52, (byte) 0x3b,
            (byte) 0x01, (byte) 0x02, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0x03,
            (byte) 0xfa, (byte) 0x04, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0x83, (byte) 0x7f, (byte) 0xfa,
            (byte) 0x04, (byte) 0x00, (byte) 0x00, (byte) 0x02, (byte) 0xfd, (byte) 0x48, (byte) 0x44, (byte) 0x09,
            (byte) 0x02, (byte) 0xfd, (byte) 0x5b, (byte) 0x00, (byte) 0x00, (byte) 0x02, (byte) 0x2b, (byte) 0x00,
            (byte) 0x00, (byte) 0x0c, (byte) 0x78, (byte) 0x08, (byte) 0x06, (byte) 0x10, (byte) 0x30, (byte) 0x0f,
            (byte) 0x0e, (byte) 0x71, (byte) 0x16 };

    /** (AB Svensk Värmemätning SVM) RESP-UD Elster F2 heat meter */
    static final byte[] testMsg3 = new byte[] { (byte) 0x68, (byte) 0x90, (byte) 0x90, (byte) 0x68, (byte) 0x08,
            (byte) 0x01, (byte) 0x72, (byte) 0x75, (byte) 0x96, (byte) 0x91, (byte) 0x00, (byte) 0xcd, (byte) 0x4e,
            (byte) 0x08, (byte) 0x04, (byte) 0x06, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0x07,
            (byte) 0xc8, (byte) 0x1e, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0x15, (byte) 0xfe, (byte) 0xbf,
            (byte) 0x00, (byte) 0x00, (byte) 0x84, (byte) 0x40, (byte) 0x15, (byte) 0xf8, (byte) 0xbf, (byte) 0x00,
            (byte) 0x00, (byte) 0x02, (byte) 0x5a, (byte) 0x79, (byte) 0x02, (byte) 0x02, (byte) 0x5e, (byte) 0xa6,
            (byte) 0x01, (byte) 0x02, (byte) 0x62, (byte) 0xd3, (byte) 0x00, (byte) 0x04, (byte) 0x22, (byte) 0x38,
            (byte) 0x09, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0x26, (byte) 0x3d, (byte) 0x07, (byte) 0x00,
            (byte) 0x00, (byte) 0x04, (byte) 0x3d, (byte) 0x05, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x04,
            (byte) 0x2e, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0x6d, (byte) 0x2b,
            (byte) 0x11, (byte) 0x78, (byte) 0x11, (byte) 0x84, (byte) 0x40, (byte) 0x6e, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x84, (byte) 0x80, (byte) 0x40, (byte) 0x6e, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x1f, (byte) 0xe8, (byte) 0x03, (byte) 0x01, (byte) 0x08, (byte) 0x13,
            (byte) 0x00, (byte) 0x01, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x75, (byte) 0x96, (byte) 0x91,
            (byte) 0x00, (byte) 0xcd, (byte) 0x4e, (byte) 0x08, (byte) 0x04, (byte) 0x07, (byte) 0xac, (byte) 0xff,
            (byte) 0x03, (byte) 0x75, (byte) 0x96, (byte) 0x91, (byte) 0x00, (byte) 0x01, (byte) 0x01, (byte) 0x01,
            (byte) 0x02, (byte) 0xff, (byte) 0x0f, (byte) 0x05, (byte) 0x3c, (byte) 0x33, (byte) 0x66, (byte) 0x5a,
            (byte) 0x66, (byte) 0xcb, (byte) 0x05, (byte) 0xdf, (byte) 0x05, (byte) 0xff, (byte) 0xff, (byte) 0x9d,
            (byte) 0x39, (byte) 0x13, (byte) 0x01, (byte) 0xa0, (byte) 0x05, (byte) 0x61, (byte) 0x31, (byte) 0xd3,
            (byte) 0x16 };

    /** Landis & Staefa electronic heat meter */
    static final byte[] testMsg4 = new byte[] { (byte) 0x68, (byte) 0x59, (byte) 0x59, (byte) 0x68, (byte) 0x08,
            (byte) 0x00, (byte) 0x72, (byte) 0x82, (byte) 0x13, (byte) 0x02, (byte) 0x08, (byte) 0x65, (byte) 0x32,
            (byte) 0x99, (byte) 0x06, (byte) 0xeb, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x0c, (byte) 0x13,
            (byte) 0x01, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x0b, (byte) 0x22, (byte) 0x52, (byte) 0x09,
            (byte) 0x02, (byte) 0x04, (byte) 0x6d, (byte) 0x38, (byte) 0x08, (byte) 0x6e, (byte) 0x19, (byte) 0x32,
            (byte) 0x6c, (byte) 0x00, (byte) 0x00, (byte) 0x0c, (byte) 0x78, (byte) 0x82, (byte) 0x13, (byte) 0x02,
            (byte) 0x08, (byte) 0x06, (byte) 0xfd, (byte) 0x0c, (byte) 0x0a, (byte) 0x00, (byte) 0x01, (byte) 0x00,
            (byte) 0xfa, (byte) 0x01, (byte) 0x0d, (byte) 0xfd, (byte) 0x0b, (byte) 0x05, (byte) 0x31, (byte) 0x32,
            (byte) 0x48, (byte) 0x46, (byte) 0x57, (byte) 0x01, (byte) 0xfd, (byte) 0x0e, (byte) 0x00, (byte) 0x0b,
            (byte) 0x3b, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x0f, (byte) 0x37, (byte) 0xfd, (byte) 0x17,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x02, (byte) 0x7a, (byte) 0x0d, (byte) 0x00, (byte) 0x02, (byte) 0x78, (byte) 0x0d, (byte) 0x00,
            (byte) 0x11, (byte) 0x16 };

    /** Landis & Staefa electronic / Siemens heat meter WFH21 */
    static final byte[] testMsg5 = new byte[] { (byte) 0x68, (byte) 0x5e, (byte) 0x5e, (byte) 0x68, (byte) 0x08,
            (byte) 0x05, (byte) 0x72, (byte) 0x91, (byte) 0x64, (byte) 0x00, (byte) 0x08, (byte) 0x65, (byte) 0x32,
            (byte) 0x99, (byte) 0x06, (byte) 0xda, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x0c, (byte) 0x13,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x0b, (byte) 0x22, (byte) 0x86, (byte) 0x40,
            (byte) 0x04, (byte) 0x04, (byte) 0x6d, (byte) 0x24, (byte) 0x0a, (byte) 0x61, (byte) 0x1c, (byte) 0x32,
            (byte) 0x6c, (byte) 0x00, (byte) 0x00, (byte) 0x0c, (byte) 0x78, (byte) 0x91, (byte) 0x64, (byte) 0x00,
            (byte) 0x08, (byte) 0x06, (byte) 0xfd, (byte) 0x0c, (byte) 0x0a, (byte) 0x00, (byte) 0x01, (byte) 0x00,
            (byte) 0xfa, (byte) 0x01, (byte) 0x0d, (byte) 0xfd, (byte) 0x0b, (byte) 0x05, (byte) 0x31, (byte) 0x32,
            (byte) 0x48, (byte) 0x46, (byte) 0x57, (byte) 0x01, (byte) 0xfd, (byte) 0x0e, (byte) 0x00, (byte) 0x4c,
            (byte) 0x13, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x42, (byte) 0x6c, (byte) 0x5f,
            (byte) 0x1c, (byte) 0x0f, (byte) 0x37, (byte) 0xfd, (byte) 0x17, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x02, (byte) 0x7a, (byte) 0x25,
            (byte) 0x00, (byte) 0x02, (byte) 0x78, (byte) 0x25, (byte) 0x00, (byte) 0x82, (byte) 0x16 };

    /** TST Heat Meater Inlet */
    static final byte[] testMsg6 = new byte[] { (byte) 0x68, (byte) 0x50, (byte) 0x50, (byte) 0x68, (byte) 0x08,
            (byte) 0x0d, (byte) 0x72, (byte) 0x13, (byte) 0x40, (byte) 0x56, (byte) 0x41, (byte) 0x74, (byte) 0x52,
            (byte) 0x52, (byte) 0x0c, (byte) 0x04, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x0c, (byte) 0xfb,
            (byte) 0x01, (byte) 0x20, (byte) 0x22, (byte) 0x00, (byte) 0x00, (byte) 0x8c, (byte) 0x10, (byte) 0xfb,
            (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8c, (byte) 0x20, (byte) 0x16,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x0c, (byte) 0x16, (byte) 0x00, (byte) 0x53,
            (byte) 0x06, (byte) 0x00, (byte) 0x0c, (byte) 0x2e, (byte) 0x62, (byte) 0x65, (byte) 0x01, (byte) 0x00,
            (byte) 0x0b, (byte) 0x3e, (byte) 0x54, (byte) 0x04, (byte) 0x00, (byte) 0x0a, (byte) 0x5a, (byte) 0x06,
            (byte) 0x07, (byte) 0x0a, (byte) 0x5e, (byte) 0x84, (byte) 0x03, (byte) 0x0a, (byte) 0x62, (byte) 0x22,
            (byte) 0x03, (byte) 0x0a, (byte) 0x27, (byte) 0x04, (byte) 0x00, (byte) 0x04, (byte) 0x6d, (byte) 0x39,
            (byte) 0x09, (byte) 0x6b, (byte) 0x1a, (byte) 0x72, (byte) 0x6c, (byte) 0x00, (byte) 0x00, (byte) 0x97,
            (byte) 0x16 };

    /*** TST Heat Meter */
    static final byte[] testMsg7 = new byte[] { (byte) 0x68, (byte) 0x88, (byte) 0x88, (byte) 0x68, (byte) 0x08,
            (byte) 0x01, (byte) 0x72, (byte) 0x75, (byte) 0x96, (byte) 0x91, (byte) 0x00, (byte) 0x74, (byte) 0x52,
            (byte) 0x08, (byte) 0x04, (byte) 0x06, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0x07,
            (byte) 0xc8, (byte) 0x1e, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0x15, (byte) 0xfe, (byte) 0xbf,
            (byte) 0x00, (byte) 0x00, (byte) 0x84, (byte) 0x40, (byte) 0x15, (byte) 0xf8, (byte) 0xbf, (byte) 0x00,
            (byte) 0x00, (byte) 0x02, (byte) 0x5a, (byte) 0x79, (byte) 0x02, (byte) 0x02, (byte) 0x5e, (byte) 0xa6,
            (byte) 0x01, (byte) 0x02, (byte) 0x62, (byte) 0xd3, (byte) 0x00, (byte) 0x04, (byte) 0x22, (byte) 0x38,
            (byte) 0x09, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0x26, (byte) 0x3d, (byte) 0x07, (byte) 0x00,
            (byte) 0x00, (byte) 0x04, (byte) 0x3d, (byte) 0x05, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x04,
            (byte) 0x2e, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0x6d, (byte) 0x2b,
            (byte) 0x11, (byte) 0x78, (byte) 0x11, (byte) 0x84, (byte) 0x40, (byte) 0x6e, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x1f, (byte) 0xe8, (byte) 0x03, (byte) 0x01, (byte) 0x08, (byte) 0x13,
            (byte) 0x00, (byte) 0x21, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x75, (byte) 0x96, (byte) 0x91,
            (byte) 0x00, (byte) 0xcd, (byte) 0x4e, (byte) 0x08, (byte) 0x04, (byte) 0x07, (byte) 0xac, (byte) 0xf8,
            (byte) 0x03, (byte) 0x75, (byte) 0x96, (byte) 0x91, (byte) 0x33, (byte) 0x01, (byte) 0x41, (byte) 0x01,
            (byte) 0x02, (byte) 0xff, (byte) 0x0f, (byte) 0x05, (byte) 0x3c, (byte) 0x33, (byte) 0x63, (byte) 0x5a,
            (byte) 0x66, (byte) 0xcb, (byte) 0x05, (byte) 0xdf, (byte) 0x05, (byte) 0xff, (byte) 0xff, (byte) 0x9d,
            (byte) 0x39, (byte) 0x13, (byte) 0x01, (byte) 0xa0, (byte) 0x05, (byte) 0x61, (byte) 0x31, (byte) 0x55,
            (byte) 0x16 };

    /** STV Automation, Bialon impulse counter */
    static final byte[] testMsg8 = HexUtils.hexToBytes("6851516808007204000054964EC80F010000000600A50A0000000"
            + "0032800000005FE280000803F0600A10000000000032800000005FE280000803F0600030000000000032800000005FE280000"
            + "803F03FD24580200B016");

    /** Kamstrup Electricity Meter */
    static final byte[] testMsg9 = HexUtils.hexToBytes("68F9F968081D72295797102D2C18020740000004843BB2FA72000"
            + "4843C0000000004FB823B0000000004FB823C0000000004FFF763FCCA7D0404FFF764000000008410843BB2FA72008420843B"
            + "0000000014AB3BEF3D000014AB3C0000000014FFF7B43B0000000014FFF7B43C0000000004FBFB3B1A990A0004AB3BAA14000"
            + "00C79295797100C7856095419066D43058D49180006FFF7B93B401E894918009410AB3BEF3D00008610FFF7B93B401E894918"
            + "009420AB3B000000008620FFF7B93B40006041180002FFF749E40002FFF74AE40002FFF74BE30002FFF74CA80102FFF74D960"
            + "202FFF74E1D0502FFF74F5D0302FFF750C30502FFF7518B0BD116");

    /** Schneider Electric iEM3275 Electricity Meter (exception, missing bytes) */
    static final byte[] testMsg10 = HexUtils.hexToBytes("68F6F668085D7246201434A34C15027A0000000783FFFF091623"
            + "09000000000087400372BB010200000000874083FFFF091CE566010000000004EDFFFF0C000001010783FFFF0D59CA9A04000"
            + "00000874083FFFF0D72BB0102000000000783FFFF01B9069201000000000783FFFF020D076601000000000783FFFF0394589F"
            + "010000000004EDFFFF0E0000010107FD61000000000000000003FFFF100000008710030000000000000000872003000000000"
            + "00000008730030000000000000000878010030000000000000000046D160E4F2A03FFFF2C64000003FFFF2D00000005FFFF2E"
            + "0000C84205FFFF2F0000FA4303FFFF3000000003FD1B0000");

    /** Cyble Mbus V1.4 */
    static final byte[] testMsg11 = HexUtils.hexToBytes("68565668080B725646001077041403DB1000000C78564600100D"
            + "7C084449202E747375630A20203434333238323330046D0E0F502A027C09656D6974202E746162B20404158F04000004957F0"
            + "00000004415180000000F00031FAD16");

    static final byte[] testMsg12 = { 104, -12, -12, 104, 8, 94, 114, -124, 48, 57, 4, -93, 76, 22, 2, 33, 0, 0, 0, 13,
            -3, 10, 18, 99, 105, 114, 116, 99, 101, 108, 69, 32, 114, 101, 100, 105, 101, 110, 104, 99, 83, 13, -3, 12,
            8, 32, 53, 51, 49, 51, 77, 69, 105, 13, -3, 14, 7, 50, 48, 48, 46, 52, 46, 49, 3, -3, 23, 0, 0, 0, 5, -3,
            -36, -1, -1, 1, -98, 38, 44, 64, 5, -3, -36, -1, -1, 2, 120, -7, -125, 63, 5, -3, -36, -1, -1, 3, 50, 78,
            12, 63, 5, -3, -36, -1, -1, 0, 40, 57, -74, 63, 5, -3, -55, -1, -1, 5, 56, 12, -55, 67, 5, -3, -55, -1, -1,
            6, -105, 49, -54, 67, 5, -3, -55, -1, -1, 7, -101, 61, -54, 67, 5, -3, -55, -1, -1, 8, -103, -46, -55, 67,
            5, -3, -55, -1, -1, 1, -44, -11, 103, 67, 5, -3, -55, -1, -1, 2, -33, 10, 105, 67, 5, -3, -55, -1, -1, 3,
            -73, 35, 106, 67, 5, -3, -55, -1, -1, 4, 36, 12, 105, 67, 5, -82, -1, -1, 1, 1, -8, 23, 63, 5, -82, -1, -1,
            2, -120, 1, 18, 62, 5, -82, -1, -1, 3, 19, 87, -103, 61, 5, 46, 69, -93, 79, 63, -123, 64, 46, 100, 108, 0,
            -65, -123, -128, 64, 46, -72, 36, 116, 63, 5, -1, -1, 10, -94, 35, -109, 63, 5, -1, -1, 11 };

    /** ABB A41 513-100 electric meter Message 1 */
    static final byte[] test_ABB_A41_Msg1 = new byte[] { (byte) 0x68, (byte) 0xf6, (byte) 0xf6, (byte) 0x68,
            (byte) 0x08, (byte) 0x09, (byte) 0x72, (byte) 0x19, (byte) 0x78, (byte) 0x21, (byte) 0x00, (byte) 0x42,
            (byte) 0x04, (byte) 0x20, (byte) 0x02, (byte) 0x0b, (byte) 0x10, (byte) 0x00, (byte) 0x00, (byte) 0x0e,
            (byte) 0x84, (byte) 0x00, (byte) 0x13, (byte) 0x39, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x8e, (byte) 0x10, (byte) 0x84, (byte) 0x00, (byte) 0x13, (byte) 0x39, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x8e, (byte) 0x20, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8e, (byte) 0x30, (byte) 0x84, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8e, (byte) 0x80,
            (byte) 0x10, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x8e, (byte) 0x40, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8e, (byte) 0x50, (byte) 0x84, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8e, (byte) 0x60, (byte) 0x84,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8e,
            (byte) 0x70, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x8e, (byte) 0xc0, (byte) 0x10, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x01, (byte) 0xff, (byte) 0x93, (byte) 0x00,
            (byte) 0x01, (byte) 0x04, (byte) 0xff, (byte) 0xa0, (byte) 0x15, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x04, (byte) 0xff, (byte) 0xa1, (byte) 0x15, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x04, (byte) 0xff, (byte) 0xa2, (byte) 0x15, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x04, (byte) 0xff, (byte) 0xa3, (byte) 0x15, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x07, (byte) 0xff, (byte) 0xa6, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x07, (byte) 0xff, (byte) 0xa7,
            (byte) 0x00, (byte) 0x00, (byte) 0x0c, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x07, (byte) 0xff, (byte) 0xa8, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x07, (byte) 0xff, (byte) 0xa9,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x0e, (byte) 0xed, (byte) 0x18, (byte) 0x01, (byte) 0x01, (byte) 0x01, (byte) 0x01,
            (byte) 0x01, (byte) 0x10, (byte) 0x02, (byte) 0xff, (byte) 0xf9, (byte) 0x8a, (byte) 0x18, (byte) 0x50,
            (byte) 0x00, (byte) 0x0d, (byte) 0xfd, (byte) 0x8e, (byte) 0x00, (byte) 0x07, (byte) 0x30, (byte) 0x2e,
            (byte) 0x32, (byte) 0x31, (byte) 0x2e, (byte) 0x31, (byte) 0x41, (byte) 0x0d, (byte) 0xff, (byte) 0xaa,
            (byte) 0x00, (byte) 0x0b, (byte) 0x30, (byte) 0x30, (byte) 0x31, (byte) 0x2d, (byte) 0x33, (byte) 0x31,
            (byte) 0x35, (byte) 0x20, (byte) 0x31, (byte) 0x34, (byte) 0x41, (byte) 0x1f, (byte) 0xf1, (byte) 0x16 };

    /** ABB A41 513-100 electric meter Message 2 */
    static final byte[] test_ABB_A41_Msg2 = new byte[] { (byte) 0x68, (byte) 0xea, (byte) 0xea, (byte) 0x68,
            (byte) 0x08, (byte) 0x09, (byte) 0x72, (byte) 0x19, (byte) 0x78, (byte) 0x21, (byte) 0x00, (byte) 0x42,
            (byte) 0x04, (byte) 0x20, (byte) 0x02, (byte) 0x0c, (byte) 0x10, (byte) 0x00, (byte) 0x00, (byte) 0x04,
            (byte) 0xff, (byte) 0x98, (byte) 0x00, (byte) 0x9f, (byte) 0x03, (byte) 0x00, (byte) 0x00, (byte) 0x0e,
            (byte) 0xff, (byte) 0xec, (byte) 0x00, (byte) 0x15, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x04, (byte) 0xa9, (byte) 0x00, (byte) 0x4c, (byte) 0x07, (byte) 0x00, (byte) 0x00,
            (byte) 0x84, (byte) 0x80, (byte) 0x40, (byte) 0xa9, (byte) 0x00, (byte) 0xb3, (byte) 0xfe, (byte) 0xff,
            (byte) 0xff, (byte) 0x84, (byte) 0x80, (byte) 0x80, (byte) 0x40, (byte) 0xa9, (byte) 0x00, (byte) 0xe2,
            (byte) 0x0e, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0xfd, (byte) 0xc8, (byte) 0xff, (byte) 0x81,
            (byte) 0x00, (byte) 0x02, (byte) 0x09, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0xfd, (byte) 0xd9,
            (byte) 0xff, (byte) 0x81, (byte) 0x00, (byte) 0xa6, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x0a,
            (byte) 0xff, (byte) 0xd9, (byte) 0x00, (byte) 0x25, (byte) 0x50, (byte) 0x02, (byte) 0xff, (byte) 0xe0,
            (byte) 0x00, (byte) 0xeb, (byte) 0x01, (byte) 0x02, (byte) 0xff, (byte) 0xd2, (byte) 0x00, (byte) 0xa2,
            (byte) 0xfd, (byte) 0x02, (byte) 0xff, (byte) 0xc2, (byte) 0xff, (byte) 0x81, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x02, (byte) 0xff, (byte) 0xca, (byte) 0xff, (byte) 0x81, (byte) 0x00, (byte) 0x9b,
            (byte) 0xff, (byte) 0x01, (byte) 0xff, (byte) 0x97, (byte) 0x00, (byte) 0x04, (byte) 0x8e, (byte) 0x80,
            (byte) 0x40, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x8e, (byte) 0x90, (byte) 0x40, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8e, (byte) 0xa0, (byte) 0x40, (byte) 0x84,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8e,
            (byte) 0xb0, (byte) 0x40, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x8e, (byte) 0x80, (byte) 0x50, (byte) 0x84, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8e, (byte) 0xc0, (byte) 0x40,
            (byte) 0x84, (byte) 0x00, (byte) 0x55, (byte) 0x08, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x8e, (byte) 0xd0, (byte) 0x40, (byte) 0x84, (byte) 0x00, (byte) 0x55, (byte) 0x08, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8e, (byte) 0xe0, (byte) 0x40, (byte) 0x84, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8e, (byte) 0xf0,
            (byte) 0x40, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x8e, (byte) 0xc0, (byte) 0x50, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x01, (byte) 0xff, (byte) 0xad, (byte) 0x00,
            (byte) 0x01, (byte) 0x1f, (byte) 0x85, (byte) 0x16 };

    /** ABB A41 513-100 electric meter Message 3 */
    static final byte[] test_ABB_A41_Msg3 = new byte[] { (byte) 0x68, (byte) 0x94, (byte) 0x94, (byte) 0x68,
            (byte) 0x08, (byte) 0x09, (byte) 0x72, (byte) 0x19, (byte) 0x78, (byte) 0x21, (byte) 0x00, (byte) 0x42,
            (byte) 0x04, (byte) 0x20, (byte) 0x02, (byte) 0x0d, (byte) 0x10, (byte) 0x00, (byte) 0x00, (byte) 0x81,
            (byte) 0x40, (byte) 0xfd, (byte) 0x9a, (byte) 0x00, (byte) 0x00, (byte) 0x81, (byte) 0x80, (byte) 0x40,
            (byte) 0xfd, (byte) 0x9a, (byte) 0x00, (byte) 0x00, (byte) 0x81, (byte) 0xc0, (byte) 0x40, (byte) 0xfd,
            (byte) 0x9a, (byte) 0x15, (byte) 0x00, (byte) 0x81, (byte) 0x80, (byte) 0x80, (byte) 0x40, (byte) 0xfd,
            (byte) 0x9a, (byte) 0x15, (byte) 0x00, (byte) 0x81, (byte) 0x40, (byte) 0xfd, (byte) 0x9b, (byte) 0x15,
            (byte) 0x00, (byte) 0x81, (byte) 0x80, (byte) 0x40, (byte) 0xfd, (byte) 0x9b, (byte) 0x15, (byte) 0x00,
            (byte) 0x81, (byte) 0xc0, (byte) 0x40, (byte) 0xfd, (byte) 0x9b, (byte) 0x00, (byte) 0x00, (byte) 0x81,
            (byte) 0x80, (byte) 0x80, (byte) 0x40, (byte) 0xfd, (byte) 0x9b, (byte) 0x00, (byte) 0x00, (byte) 0xc1,
            (byte) 0x40, (byte) 0xfd, (byte) 0x9b, (byte) 0x15, (byte) 0x00, (byte) 0xc1, (byte) 0x80, (byte) 0x40,
            (byte) 0xfd, (byte) 0x9b, (byte) 0x15, (byte) 0x00, (byte) 0xc1, (byte) 0xc0, (byte) 0x40, (byte) 0xfd,
            (byte) 0x9b, (byte) 0x00, (byte) 0x01, (byte) 0xc1, (byte) 0x80, (byte) 0x80, (byte) 0x40, (byte) 0xfd,
            (byte) 0x9b, (byte) 0x00, (byte) 0x01, (byte) 0x8e, (byte) 0x40, (byte) 0xfd, (byte) 0xe1, (byte) 0x00,
            (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8e, (byte) 0x80,
            (byte) 0x40, (byte) 0xfd, (byte) 0xe1, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x8e, (byte) 0xc0, (byte) 0x40, (byte) 0xfd, (byte) 0xe1, (byte) 0x00,
            (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8e, (byte) 0x80,
            (byte) 0x80, (byte) 0x40, (byte) 0xfd, (byte) 0xe1, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x1f, (byte) 0x35, (byte) 0x16 };

    /** ABB A41 513-100 electric meter Message 4 */
    static final byte[] test_ABB_A41_Msg4 = new byte[] { (byte) 0x68, (byte) 0xcf, (byte) 0xcf, (byte) 0x68,
            (byte) 0x08, (byte) 0x09, (byte) 0x72, (byte) 0x19, (byte) 0x78, (byte) 0x21, (byte) 0x00, (byte) 0x42,
            (byte) 0x04, (byte) 0x20, (byte) 0x02, (byte) 0x0e, (byte) 0x10, (byte) 0x00, (byte) 0x00, (byte) 0x0e,
            (byte) 0x84, (byte) 0xff, (byte) 0xf2, (byte) 0x00, (byte) 0x13, (byte) 0x39, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x8e, (byte) 0x40, (byte) 0x84, (byte) 0xff, (byte) 0xf2, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8e, (byte) 0x80,
            (byte) 0x40, (byte) 0x84, (byte) 0xff, (byte) 0xf2, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8e, (byte) 0xc0, (byte) 0x40, (byte) 0x84, (byte) 0xff,
            (byte) 0xf2, (byte) 0x00, (byte) 0x55, (byte) 0x08, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x04, (byte) 0xff, (byte) 0xf1, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x84, (byte) 0x40, (byte) 0xff, (byte) 0xf1, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x84, (byte) 0x80, (byte) 0x40, (byte) 0xff, (byte) 0xf1, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x84, (byte) 0xc0, (byte) 0x40, (byte) 0xff, (byte) 0xf1,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x0e, (byte) 0xff, (byte) 0xf9,
            (byte) 0xc4, (byte) 0x00, (byte) 0x39, (byte) 0x91, (byte) 0x03, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x0e, (byte) 0xff, (byte) 0xf9, (byte) 0xc9, (byte) 0x00, (byte) 0x14, (byte) 0x39, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0xff, (byte) 0xa4, (byte) 0x00, (byte) 0xe8,
            (byte) 0x03, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0xff, (byte) 0xa5, (byte) 0x00, (byte) 0xe8,
            (byte) 0x03, (byte) 0x00, (byte) 0x00, (byte) 0x8e, (byte) 0x80, (byte) 0x80, (byte) 0x40, (byte) 0x84,
            (byte) 0x00, (byte) 0x86, (byte) 0x76, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8e,
            (byte) 0xc0, (byte) 0x80, (byte) 0x40, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x87, (byte) 0x80, (byte) 0xc0, (byte) 0x40, (byte) 0x84,
            (byte) 0x00, (byte) 0x49, (byte) 0x0f, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x87, (byte) 0xc0, (byte) 0xc0, (byte) 0x40, (byte) 0x84, (byte) 0x00, (byte) 0xa9,
            (byte) 0xfc, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x87,
            (byte) 0x80, (byte) 0x80, (byte) 0x80, (byte) 0x40, (byte) 0x84, (byte) 0x00, (byte) 0x06, (byte) 0x1e,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x1f, (byte) 0x53,
            (byte) 0x16 };

    /** ABB A41 513-100 electric meter Message 5 */
    static final byte[] test_ABB_A41_Msg5 = new byte[] { (byte) 0x68, (byte) 0xc8, (byte) 0xc8, (byte) 0x68,
            (byte) 0x08, (byte) 0x09, (byte) 0x72, (byte) 0x19, (byte) 0x78, (byte) 0x21, (byte) 0x00, (byte) 0x42,
            (byte) 0x04, (byte) 0x20, (byte) 0x02, (byte) 0x0f, (byte) 0x10, (byte) 0x00, (byte) 0x00, (byte) 0x4e,
            (byte) 0xed, (byte) 0xeb, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x01, (byte) 0x01,
            (byte) 0x00, (byte) 0x4e, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0xce, (byte) 0x40, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xce, (byte) 0x80, (byte) 0x40, (byte) 0x84,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xce,
            (byte) 0xc0, (byte) 0x40, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0xce, (byte) 0x10, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xce, (byte) 0x20, (byte) 0x84, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xce, (byte) 0x30,
            (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0xce, (byte) 0x80, (byte) 0x10, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xce, (byte) 0x90, (byte) 0x40, (byte) 0x84, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xce, (byte) 0xa0,
            (byte) 0x40, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0xce, (byte) 0xb0, (byte) 0x40, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xce, (byte) 0x80, (byte) 0x50, (byte) 0x84,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xce,
            (byte) 0x40, (byte) 0xfd, (byte) 0xe1, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0xce, (byte) 0x80, (byte) 0x40, (byte) 0xfd, (byte) 0xe1, (byte) 0x00,
            (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xce, (byte) 0xc0,
            (byte) 0x40, (byte) 0xfd, (byte) 0xe1, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0xce, (byte) 0x80, (byte) 0x80, (byte) 0x40, (byte) 0xfd, (byte) 0xe1,
            (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x0f,
            (byte) 0x9f, (byte) 0x16 };

    /** ABB A41 513-100 electric meter all messages */
    static final ArrayList<byte[]> test_ABB_A41_messages = new ArrayList<>(Arrays.asList(test_ABB_A41_Msg1,
            test_ABB_A41_Msg2, test_ABB_A41_Msg3, test_ABB_A41_Msg4, test_ABB_A41_Msg5));
    static final int[] test_ABB_A41_DataRecodSizes = { 23, 24, 16, 17, 17 };

    /** Schneider Electric electricity meter message 1 */
    static final byte[] test_Schneider_Electric_Msg1 = HexUtils.hexToBytes("68F4F468085D7246201434A34C1502"
            + "5D0000000DFD0A126369727463656C452072656469656E6863530DFD0C0820353332334D45690DFD0E073730302E332E31"
            + "03FD1700000005FDDCFF01DE97554205FDDCFF02367C364205FDDCFF03F261544205FDDCFF0003D24A4205FDC9FF058823"
            + "C84305FDC9FF06FF20C94305FDC9FF076B38C94305FDC9FF0851D4C84305FDC9FF0176D3674305FDC9FF028B31674305FD"
            + "C9FF0335AE684305FDC9FF0467E6674305AEFF0117C9384105AEFF027E4D204105AEFF0314DB3E41052E6AFC054285402E"
            + "82802F418580402EA5FC0C4205FF0ABF49733F05FF0BDAF4474207034FADE804000000001F8216");

    /** Schneider Electric electricity meter message 2 */
    static final byte[] test_Schneider_Electric_Msg2 = HexUtils.hexToBytes("68F6F668085D7246201434A34C1502"
            + "5E0000000783FF098D83090000000000874003E316230200000000874083FF09237D7D010000000004EDFF0C0000010107"
            + "83FF0D58ADE80400000000874083FF0DE3162302000000000783FF017262AC01000000000783FF0268787D010000000007"
            + "83FF03353ABB010000000004EDFF0E0000010107FD61000000000000000003FF1000000087100300000000000000008720"
            + "0300000000000000008730030000000000000000878010030000000000000000046D250A4E2B03FF2C64000003FF2D0000"
            + "0005FF2E0000C84205FF2F0000FA4303FF3000000003FD1B00000002FF32000003FD1AFFFF001F5C16");

    /** Schneider Electric electricity meter message 3 */
    static final byte[] test_Schneider_Electric_Msg3 = HexUtils.hexToBytes("68F1F168085D7246201434A34C1502"
            + "5F00000002FF34000005FF350000803F02FF36000002FF37000002FF38000004EDFF390000010105FF3A0000C0FF06FF20"
            + "B1589002000003FF2103000003FF2204000003FF230B000003FF243200000503CFDAA0470583FF0910E01B448540030F0E"
            + "0C47854083FF098152C3460583FF0DCFDAA047854083FF0D0F0E0C470583FF013D55DB460583FF021950C3460583FF03B8"
            + "EEE24605FD6100000000851003000000008520030000000085300300000000858010030000000003FF2500000005FF2600"
            + "00C84203FF2764000003FF2803000003FF29FA000003FF2A05000003FF2B0000000FE816");

    /** Schneider Electric electricity meter all messages */
    static final ArrayList<byte[]> test_Schneider_Electric_message = new ArrayList<>(
            Arrays.asList(test_Schneider_Electric_Msg1, test_Schneider_Electric_Msg2, test_Schneider_Electric_Msg3));
    static final int[] test_Schneider_Electric_DataRecodSizes = { 25, 25, 33 };

}