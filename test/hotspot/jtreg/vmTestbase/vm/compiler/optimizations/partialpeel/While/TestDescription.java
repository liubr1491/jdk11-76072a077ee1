/*
 * Copyright (c) 2017, 2018, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */


/*
 * @test
 *
 * @summary converted from VM Testbase vm/compiler/optimizations/partialpeel/While.
 * VM Testbase keywords: [jit, quick]
 * VM Testbase readme:
 * DESCRIPTION
 *     This test triggers Parial Peel C2 optimization for while loop:
 *     "Partially peel (aka loop rotation) the top portion of a loop
 *     (called the peel section below) by cloning it and placing one copy
 *     just before the new loop head and the other copy at the bottom of
 *     the new loop".
 *     This optimization is applicable for non-counted loops, that contains
 *     test (condition) with inductive vars and jumps outside from loop.
 *
 * @library /vmTestbase
 *          /test/lib
 * @run driver jdk.test.lib.FileInstaller . .
 * @run main/othervm vm.compiler.optimizations.partialpeel.While
 */

