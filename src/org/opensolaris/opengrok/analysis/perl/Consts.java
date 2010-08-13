/*
 * CDDL HEADER START
 *
 * The contents of this file are subject to the terms of the
 * Common Development and Distribution License (the "License").
 * You may not use this file except in compliance with the License.
 *
 * See LICENSE.txt included in this distribution for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL HEADER in each
 * file and include the License file at LICENSE.txt.
 * If applicable, add the following below this CDDL HEADER, with the
 * fields enclosed by brackets "[]" replaced with your own identifying
 * information: Portions Copyright [yyyy] [name of copyright owner]
 *
 * CDDL HEADER END
 */

/*
 * Copyright (c) 2010, Oracle and/or its affiliates. All rights reserved.
 */
package org.opensolaris.opengrok.analysis.perl;

import java.util.HashSet;
import java.util.Set;

/**
  * Holds static hash set containing the Perl keywords
  */
public class Consts{
    public static final Set<String> kwd = new HashSet<String>() ;
    static {
        //Note that keywords with 1 letter will be ignored since we need at least 2 chars per identifier
        kwd.add("package");
        kwd.add("sub");
	kwd.add("if");
	kwd.add("elsif");
	kwd.add("unless");
	kwd.add("else");
	kwd.add("switch");
	kwd.add("eq");
	kwd.add("ne");
	kwd.add("gt");
	kwd.add("lt");
	kwd.add("ge");
	kwd.add("le");
	kwd.add("cmp");
	kwd.add("not");
	kwd.add("and");
	kwd.add("or");
	kwd.add("xor");
	kwd.add("err");
	kwd.add("while");
	kwd.add("for");
	kwd.add("foreach");
	kwd.add("do");
	kwd.add("until");
	kwd.add("continue");
	kwd.add("defined");
	kwd.add("undef");
	kwd.add("and");
	kwd.add("or");
	kwd.add("not");
	kwd.add("bless");
	kwd.add("ref");
	kwd.add("BEGIN");
	kwd.add("END");
	kwd.add("CHECK");
	kwd.add("INIT");
	kwd.add("my");
	kwd.add("local");
	kwd.add("our");
	kwd.add("goto");
	kwd.add("return");
	kwd.add("last");
	kwd.add("next");
	kwd.add("redo");
	kwd.add("chomp");
	kwd.add("chop");
	kwd.add("chr");
	kwd.add("crypt");
	kwd.add("index");
	kwd.add("lc");
	kwd.add("lcfirst");
	kwd.add("length");
	kwd.add("ord");
	kwd.add("pack");
	kwd.add("reverse");
	kwd.add("rindex");
	kwd.add("sprintf");
	kwd.add("substr");
	kwd.add("uc");
	kwd.add("ucfirst");
	kwd.add("pos");
	kwd.add("quotemeta");
	kwd.add("split");
	kwd.add("study");
	kwd.add("abs");
	kwd.add("atan2");
	kwd.add("cos");
	kwd.add("exp");
	kwd.add("hex");
	kwd.add("int");
	kwd.add("log");
	kwd.add("oct");
	kwd.add("rand");
	kwd.add("sin");
	kwd.add("sqrt");
	kwd.add("srand");
	kwd.add("splice");
	kwd.add("unshift");
	kwd.add("shift");
	kwd.add("push");
	kwd.add("pop");
	kwd.add("split");
	kwd.add("join");
	kwd.add("reverse");
	kwd.add("grep");
	kwd.add("map");
	kwd.add("sort");
	kwd.add("unpack");
	kwd.add("each");
	kwd.add("exists");
	kwd.add("keys");
	kwd.add("values");
	kwd.add("tie");
	kwd.add("tied");
	kwd.add("untie");
	kwd.add("carp");
	kwd.add("confess");
	kwd.add("croak");
	kwd.add("dbmclose");
	kwd.add("dbmopen");
	kwd.add("die");
	kwd.add("syscall");
	kwd.add("binmode");
	kwd.add("close");
	kwd.add("closedir");
	kwd.add("eof");
	kwd.add("fileno");
	kwd.add("getc");
	kwd.add("lstat");
	kwd.add("print");
	kwd.add("printf");
	kwd.add("readdir");
	kwd.add("readline");
	kwd.add("readpipe");
	kwd.add("rewinddir");
	kwd.add("select");
	kwd.add("stat");
	kwd.add("tell");
	kwd.add("telldir");
	kwd.add("write");
	kwd.add("fcntl");
	kwd.add("flock");
	kwd.add("ioctl");
	kwd.add("open");
	kwd.add("opendir");
	kwd.add("read");
	kwd.add("seek");
	kwd.add("seekdir");
	kwd.add("sysopen");
	kwd.add("sysread");
	kwd.add("sysseek");
	kwd.add("syswrite");
	kwd.add("truncate");
	kwd.add("pack");
	kwd.add("vec");
	kwd.add("chdir");
	kwd.add("chmod");
	kwd.add("chown");
	kwd.add("chroot");
	kwd.add("glob");
	kwd.add("link");
	kwd.add("mkdir");
	kwd.add("readlink");
	kwd.add("rename");
	kwd.add("rmdir");
	kwd.add("symlink");
	kwd.add("umask");
	kwd.add("unlink");
	kwd.add("utime");
	kwd.add("caller");
	kwd.add("die");
	kwd.add("dump");
	kwd.add("eval");
	kwd.add("exit");
	kwd.add("wantarray");
	kwd.add("require");
	kwd.add("use");
	kwd.add("no");
	kwd.add("integer");
	kwd.add("strict");
	kwd.add("lib");
	kwd.add("sigtrap");
	kwd.add("subs");
	kwd.add("vars");
	kwd.add("warnings");
	kwd.add("utf8");
	kwd.add("byte");
	kwd.add("base");
	kwd.add("fields");
	kwd.add("import");
	kwd.add("alarm");
	kwd.add("exec");
	kwd.add("fork");
	kwd.add("getpgrp");
	kwd.add("getppid");
	kwd.add("getpriority");
	kwd.add("kill");
	kwd.add("pipe");
	kwd.add("setpgrp");
	kwd.add("setpriority");
	kwd.add("sleep");
	kwd.add("system");
	kwd.add("times");
	kwd.add("wait");
	kwd.add("waitpid");
	kwd.add("accept");
	kwd.add("bind");
	kwd.add("connect");
	kwd.add("getpeername");
	kwd.add("getsockname");
	kwd.add("getsockopt");
	kwd.add("listen");
	kwd.add("recv");
	kwd.add("send");
	kwd.add("setsockopt");
	kwd.add("shutdown");
	kwd.add("socket");
	kwd.add("socketpair");
	kwd.add("msgctl");
	kwd.add("msgget");
	kwd.add("msgrcv");
	kwd.add("msgsnd");
	kwd.add("semctl");
	kwd.add("semget");
	kwd.add("semop");
	kwd.add("shmctl");
	kwd.add("shmget");
	kwd.add("shmread");
	kwd.add("shmwrite");
	kwd.add("endhostent");
	kwd.add("endnetent");
	kwd.add("endprotoent");
	kwd.add("endservent");
	kwd.add("gethostbyaddr");
	kwd.add("gethostbyname");
	kwd.add("gethostent");
	kwd.add("getnetbyaddr");
	kwd.add("getnetbyname");
	kwd.add("getnetent");
	kwd.add("getprotobyname");
	kwd.add("getprotobynumber");
	kwd.add("getprotoent");
	kwd.add("getservbyname");
	kwd.add("getservbyport");
	kwd.add("getservent");
	kwd.add("sethostent");
	kwd.add("setnetent");
	kwd.add("setprotoent");
	kwd.add("setservent");
	kwd.add("getpwuid");
	kwd.add("getpwnam");
	kwd.add("getpwent");
	kwd.add("setpwent");
	kwd.add("endpwent");
	kwd.add("getgrent");
	kwd.add("getgrgid");
	kwd.add("getlogin");
	kwd.add("getgrnam");
	kwd.add("setgrent");
	kwd.add("endgrent");
	kwd.add("gmtime");
	kwd.add("localtime");
	kwd.add("time");
	kwd.add("times");
	kwd.add("warn");
	kwd.add("formline");
	kwd.add("reset");
	kwd.add("scalar");
	kwd.add("delete");
	kwd.add("prototype");
	kwd.add("lock");
	kwd.add("new");
	kwd.add("tr");
	kwd.add("y");
	kwd.add("q");
	kwd.add("qq");
	kwd.add("qx");
	kwd.add("qw");
	kwd.add("qr");

        kwd.add("given"); //Perl 5.10
        kwd.add("break");
    }
}
