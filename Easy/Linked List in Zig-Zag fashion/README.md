<h2><a href="https://practice.geeksforgeeks.org/problems/linked-list-in-zig-zag-fashion/1?page=2&status[]=unsolved&company[]=Amazon&company[]=Microsoft&company[]=Flipkart&company[]=Adobe&company[]=Google&company[]=Samsung&company[]=Accolite&company[]=MakeMyTrip&company[]=Snapdeal&company[]=Zoho&company[]=Paytm&company[]=Walmart&company[]=Goldman%20Sachs&company[]=Morgan%20Stanley&company[]=FactSet&company[]=D-E-Shaw&company[]=Ola%20Cabs&company[]=Oracle&company[]=MAQ%20Software&company[]=Facebook&company[]=SAP%20Labs&company[]=VMWare&company[]=Qualcomm&company[]=Cisco&company[]=Intuit&company[]=Visa&company[]=Linkedin&company[]=Yahoo&company[]=Payu&company[]=Wipro&company[]=BankBazaar&company[]=Synopsys&company[]=Citrix&company[]=Salesforce&company[]=Codenation&company[]=PayPal&company[]=24*7%20Innovation%20Labs&company[]=TCS&company[]=Twitter&company[]=Yatra.com&company[]=Atlassian&company[]=Bloomberg&company[]=Oxigen%20Wallet&company[]=Swiggy&company[]=Teradata&company[]=Accenture&company[]=Apple&company[]=Myntra&company[]=CouponDunia&company[]=Amdocs&company[]=Belzabar&company[]=Rockstand&company[]=Expedia&company[]=Boomerang%20Commerce&company[]=Times%20Internet&company[]=Infosys&company[]=Veritas&company[]=Juniper%20Networks&company[]=United%20Health%20Group&company[]=Uber&company[]=IBM&company[]=GreyOrange&company[]=Sapient&company[]=ABCO&company[]=Airtel&company[]=Informatica&company[]=Junglee%20Games&company[]=Polycom&company[]=Philips&company[]=Medlife&company[]=National%20Instruments&company[]=Tejas%20Network&company[]=nearbuy&company[]=Tesco&company[]=IgniteWorld&company[]=Dell&company[]=Komli%20Media&company[]=DE%20Shaw&company[]=Huawei&company[]=HCL&company[]=Intel&company[]=Zycus&company[]=redBus&company[]=American%20Express&company[]=MetLife&category[]=Linked%20List&sortBy=submissions">Linked List in Zig-Zag fashion</a></h2><h3>Difficulty Level : Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a <strong>L</strong>inked <strong>l</strong>ist, rearrange it such that converted list should be of the form a &lt; b &gt; c &lt; d &gt; e &lt; f .. where <strong>a, b, c</strong>&nbsp;are consecutive data node of linked list and such that the order of linked list is sustained.<br>
<strong>For example:</strong> In&nbsp;11&nbsp;15&nbsp;20&nbsp;5&nbsp;10&nbsp;we consider only&nbsp;11 20 5 15 10&nbsp;because it satisfies the above condition and the order of linked list. 5 20 11 15 10 is not considered as it does not follow the order of linked list.</span></p>

<p><span style="font-size:18px">To maintain the order, keep swapping the <strong>adjacent</strong> nodes of the linked list (whenever required)&nbsp;to get the desired output.&nbsp;&nbsp;</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>LinkedList: 1-&gt;2-&gt;3-&gt;4&nbsp;
<strong>Output: </strong>1 3 2 4</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>LinkedList: 11-&gt;15-&gt;20-&gt;5-&gt;10
<strong>Output: </strong>11 20 5 15 10<strong>
Explanation: </strong>In the given linked list,
after arranging them as 11 &lt; 20 &gt;&nbsp;5
&lt; 15 &gt;&nbsp;10 in the pattern as asked above.</span></pre>

<p><span style="font-size:18px"><strong>Your&nbsp;Task:</strong><br>
The task is to complete the function&nbsp;<strong>zigZag</strong>() which should reorder the list as required and return the head of the linked list.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(1)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= size of linked list(a) &lt;= 1000</span></p>
</div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Amazon</code>&nbsp;<code>OYO Rooms</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Linked List</code>&nbsp;<code>Data Structures</code>&nbsp;